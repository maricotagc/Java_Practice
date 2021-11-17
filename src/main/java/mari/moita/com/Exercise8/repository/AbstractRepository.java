package mari.moita.com.Exercise8.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public abstract class AbstractRepository {
    protected final Connection connection;

    protected AbstractRepository(Connection connection) {
        this.connection = connection;
    }

    protected void close(Statement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (Exception e) {
        }
    }

    protected void close(ResultSet resultSet) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (Exception e) {
            //
        }
    }

}
