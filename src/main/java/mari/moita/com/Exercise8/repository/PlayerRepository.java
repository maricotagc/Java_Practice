package mari.moita.com.Exercise8.repository;

import mari.moita.com.Exercise8.exceptions.PlayerException;
import mari.moita.com.Exercise8.model.Player;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PlayerRepository extends AbstractRepository {

    private static final String SQL_INSERT = "INSERT INTO player(name) VALUES(?)";
    private static final String SQL_UPDATE_BY_ID = "UPDATE player SET name = ? WHERE id = ?";
    private static final String SQL_DELETE_BY_ID = "DELETE FROM player WHERE id = ?";
    private static final String SQL_ALL = "SELECT id, name FROM player";

    public PlayerRepository(Connection connection) {
        super(connection);
    }

    public int create(Player player) throws PlayerException {
        PreparedStatement preparedStatement = null;
        int result;
        try {
            preparedStatement = connection.prepareStatement(SQL_INSERT);
            preparedStatement.setString(1, player.getName());
            result = preparedStatement.executeUpdate();
        } catch (Exception exception) {
            System.err.println(exception);
            throw new PlayerException("It was not possible to create player with name: " + player.getName());
        } finally {
            close(preparedStatement);
        }
        return result;
    }

    public int update(Player player, String newName) throws PlayerException {
        PreparedStatement preparedStatement = null;
        int result;
        try {
            preparedStatement = connection.prepareStatement(SQL_UPDATE_BY_ID);
            preparedStatement.setString(1, newName);
            preparedStatement.setInt(2, player.getId());
            result = preparedStatement.executeUpdate();
        } catch (Exception exception) {
            System.err.println(exception);
            throw new PlayerException("It was not possible to update player with id: " + player.getId());
        } finally {
            close(preparedStatement);
        }
        return result;
    }

    public int delete(Player player) throws PlayerException {
        PreparedStatement preparedStatement = null;
        int result;
        try {
            preparedStatement = connection.prepareStatement(SQL_DELETE_BY_ID);
            preparedStatement.setInt(1, player.getId());
            result = preparedStatement.executeUpdate();
        } catch (Exception exception) {
            System.err.println(exception);
            throw new PlayerException("It was not possible to delete player with id: " + player.getId());
        } finally {
            close(preparedStatement);
        }
        return result;
    }

    public List<Player> findAll() throws PlayerException {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Player> players = new ArrayList<>();

        try {
            preparedStatement = connection.prepareStatement(SQL_ALL);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Player player = new Player();
                player.setId(resultSet.getInt("id"));
                player.setName(resultSet.getString("name"));
                players.add(player);
            }
        } catch (Exception e) {
            throw new PlayerException("It was not possible to retrieve all players");
        } finally {
            close(resultSet);
            close(preparedStatement);
        }
        return players;
    }
}
