package mari.moita.com.Exercise8.repository;

import mari.moita.com.Exercise8.exceptions.GameException;
import mari.moita.com.Exercise8.model.Game;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GameRepository extends AbstractRepository {

    private static final String SQL_INSERT = "INSERT INTO game(status, player_id_1, player_id_2) VALUES(?,?,?)";
    private static final String SQL_UPDATE_STATUS_BY_ID = "UPDATE game SET status = ? WHERE id = ?";
    private static final String SQL_UPDATE_WINNER_BY_ID = "UPDATE game SET winner_id = ? WHERE id = ?";
    private static final String SQL_DELETE_BY_ID = "DELETE FROM game WHERE id = ?";
    private static final String SQL_ALL = "SELECT id, status, player_id_1, player_id_2, result, winner_id FROM game";

    public GameRepository(Connection connection) {
        super(connection);
    }

    public int create(Game game) throws GameException {
        PreparedStatement preparedStatement = null;
        int result;
        try {
            preparedStatement = connection.prepareStatement(SQL_INSERT);
            preparedStatement.setString(1, game.getStatus());
            preparedStatement.setInt(2, game.getPlayer_id_1());
            preparedStatement.setInt(3, game.getPlayer_id_2());
            result = preparedStatement.executeUpdate();
        } catch (Exception exception) {
            System.err.println(exception);
            throw new GameException("It was not possible to create game");
        } finally {
            close(preparedStatement);
        }
        return result;
    }

    public int updateStatus(Game game, String newStatus) throws GameException {
        PreparedStatement preparedStatement = null;
        int result;
        try {
            preparedStatement = connection.prepareStatement(SQL_UPDATE_STATUS_BY_ID);
            preparedStatement.setString(1, newStatus);
            preparedStatement.setInt(2, game.getId());
            result = preparedStatement.executeUpdate();
        } catch (Exception exception) {
            System.err.println(exception);
            throw new GameException("It was not possible to update game with id: " + game.getId());
        } finally {
            close(preparedStatement);
        }
        return result;
    }

    public int updateWinner(Game game, int winnerId) throws GameException {
        PreparedStatement preparedStatement = null;
        int result;
        try {
            preparedStatement = connection.prepareStatement(SQL_UPDATE_WINNER_BY_ID);
            preparedStatement.setInt(1, winnerId);
            preparedStatement.setInt(2, game.getId());
            result = preparedStatement.executeUpdate();
        } catch (Exception exception) {
            System.err.println(exception);
            throw new GameException("It was not possible to update game`s winner");
        } finally {
            close(preparedStatement);
        }
        return result;
    }

    public int delete(Game game) throws GameException {
        PreparedStatement preparedStatement = null;
        int result;
        try {
            preparedStatement = connection.prepareStatement(SQL_DELETE_BY_ID);
            preparedStatement.setInt(1, game.getId());
            result = preparedStatement.executeUpdate();
        } catch (Exception exception) {
            System.err.println(exception);
            throw new GameException("It was not possible to delete game with id: " + game.getId());
        } finally {
            close(preparedStatement);
        }
        return result;
    }

    public List<Game> findAll() throws GameException {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Game> games = new ArrayList<>();

        try {
            preparedStatement = connection.prepareStatement(SQL_ALL);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Game game = new Game();
                game.setId(resultSet.getInt("id"));
                game.setStatus(resultSet.getString("status"));
                game.setId(resultSet.getInt("player_id_1"));
                game.setId(resultSet.getInt("player_id_2"));
                game.setStatus(resultSet.getString("result"));
                game.setId(resultSet.getInt("winner_id"));
                games.add(game);
            }
        } catch (Exception e) {
            throw new GameException("It was not possible to retrieve all games");
        } finally {
            close(resultSet);
            close(preparedStatement);
        }
        return games;
    }
}
