package mari.moita.com.Exercise8;

import mari.moita.com.Exercise8.Utils.DatabaseManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AbstractBaseTest {

    private DatabaseManager databaseManager;
    {
        try {
            databaseManager = new DatabaseManager();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void createTables(Connection connection) throws SQLException {
        Statement statement = null;

        try {
            statement = connection.createStatement();
            String createPlayerTable = "DROP TABLE IF EXISTS player;" +
                    " CREATE TABLE player (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL)";
            statement.executeUpdate(createPlayerTable);

            String createGameTable = "DROP TABLE IF EXISTS game;" +
                    " CREATE TABLE game (id INTEGER PRIMARY KEY AUTOINCREMENT, status TEXT NOT NULL, " +
                    "player_id_1 INTEGER NOT NULL, player_id_2 INTEGER NOT NULL, result TEXT, winner_id INTEGER)," +
                    "FOREIGN KEY(player_id_1) REFERENCES player(id)," +
                    "FOREIGN KEY(player_id_2) REFERENCES player(id)" +
                    "FOREIGN KEY(winner_id) REFERENCES player(id))";
            statement.executeUpdate(createGameTable);
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        } finally {
            statement.close();
        }
    }
}
