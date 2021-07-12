package tr.org.bura.egitim.java.chapter16.jdbcPreparedStatementExamples;

import tr.org.bura.egitim.java.chapter16.util.SqlConnectionUtil;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatementExamples {
    public static void main(String[] args) {
        Connection mySqlConn = SqlConnectionUtil.getConnection("sakila");
        String cityId = "999";
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");
        System.out.println("Please specify the city name you wan to query?");
        String city = scanner.next();
        //Metro City' or '1' = '1
        String queryWithInlineParams = "SELECT * FROM CITY WHERE CITY = '"  + city + "'";
        try {
            Statement selectStatement = mySqlConn.createStatement();
            ResultSet selectResultSet = selectStatement.executeQuery(queryWithInlineParams);
            while (selectResultSet.next()){
                System.out.println("--------------------------------------");
                System.out.println("City Id: " + selectResultSet.getString(1));
                System.out.println("City: " + selectResultSet.getString(2));
                System.out.println("Country Id: " + selectResultSet.getString(3));
                System.out.println("Last Update Date: " + selectResultSet.getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

       System.out.println("########################################################");

        String escapeQuot = "My Name is\"Ahmet\"";

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
