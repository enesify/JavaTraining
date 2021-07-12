package tr.org.bura.training.java.jdbcExamplesWithMaven.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

class SqlConnectionUtilTest {
    private final Connection connection = SqlConnectionUtil.getConnection("sakila");

    @Test
    void Should_Not_Return_NullConnection() {
        //Connection connection = null;
        Assertions.assertNotNull(connection);

    }

    @Test
    void Should_Get_Success_When_Closing_Connection(){
        try {
            SqlConnectionUtil.closeConnection();
            Assertions.assertEquals(Boolean.TRUE, SqlConnectionUtil.mySqlConnection.isClosed());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}