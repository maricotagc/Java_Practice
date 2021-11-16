package mari.moita.com.Exercise8.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private static final String URL = "jdbc:sqlite:test.db";
    private Connection connection;

    public DatabaseManager() throws Exception {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(URL);

        } catch (Exception e) {
            throw new Exception("It was not possible to connect to the tournament database", e);
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
