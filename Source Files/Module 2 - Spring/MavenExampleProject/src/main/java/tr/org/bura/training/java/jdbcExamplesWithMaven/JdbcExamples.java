package tr.org.bura.training.java.jdbcExamplesWithMaven;

import tr.org.bura.training.java.jdbcExamplesWithMaven.util.SqlConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcExamples {
    public static void main(String[] args) {
        Connection mySqlConn = SqlConnectionUtil.getConnection("sakila");
        String cityId = "999";
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");
        System.out.println("Please specify the city name you wan to query?");
        String city = scanner.next();

        String queryWithPreparedStatement = "SELECT * FROM CITY WHERE CITY = ?";
        try {
            PreparedStatement preparedStatement = mySqlConn.prepareStatement(queryWithPreparedStatement);
            preparedStatement.setString(1, city );
            ResultSet preparedResultSet = preparedStatement.executeQuery();

            while (preparedResultSet.next()){
                System.out.println("--------------------------------------");
                System.out.println("City Id: " + preparedResultSet.getString(1));
                System.out.println("City: " + preparedResultSet.getString(2));
                System.out.println("Country Id: " + preparedResultSet.getString(3));
                System.out.println("Last Update Date: " + preparedResultSet.getString(4));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
