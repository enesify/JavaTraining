package tr.org.bura.egitim.java.chapter16.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class SqlConnectionUtil {
    private static final Properties connProperties = new Properties();
    private static Connection mySqlConnection = null;
    public static Connection getConnection(String schema){
        connProperties.put("user", "root");
        connProperties.put("password", "Mysql_j@v@course_Admin21");
        try {
            mySqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + schema, connProperties);
            System.out.println("Connection successful");
        } catch (SQLException e) {
            System.out.println("Unable to get a connection to the DB. Error: " + e.getMessage());
        }
        return mySqlConnection;
    }

    public static void closeConnection() throws SQLException {
        if (!mySqlConnection.isClosed() && mySqlConnection != null){
            mySqlConnection.close();
            System.out.println("Connection closed successfully");
        }
    }

}
