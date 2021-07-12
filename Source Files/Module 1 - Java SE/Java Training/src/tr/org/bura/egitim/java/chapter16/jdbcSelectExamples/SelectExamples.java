package tr.org.bura.egitim.java.chapter16.jdbcSelectExamples;

import java.sql.*;
import java.util.Properties;

public class SelectExamples {
    public static void main(String[] args) {
        Connection mySqlConnection = null;
        Statement statement =null;
        String schema = "sakila";
        try {
            Properties connProperties = new Properties();
            connProperties.put("user", "root");
            connProperties.put("password", "Mysql_j@v@course_Admin21");
            mySqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + schema, connProperties);
            System.out.printf("Successfully connected to the database and schema: %s", schema);
            System.out.println();

            statement = mySqlConnection.createStatement();
            ResultSet selectResultSet = statement.executeQuery("SELECT * FROM CITY WHERE CITY_ID <= 10");

            while (selectResultSet.next()){
                System.out.println("--------------------------------------");
                System.out.println("City Id: " + selectResultSet.getString(1));
                System.out.println("City: " + selectResultSet.getString(2));
                System.out.println("Country Id: " + selectResultSet.getString(3));
                System.out.println("Last Update Date: " + selectResultSet.getString(4));
            }

        } catch (SQLException e) {
            System.out.println("Unable to connect to the DB at the specified address!");
            return;
        }
        finally{
            if(mySqlConnection != null){
                try {
                    mySqlConnection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null){
                try {
                    statement.close();
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
