package tr.org.bura.egitim.java.chapter16.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MysqlConnectionExample {
    public static void main(String[] args) {
        //get jdbc driver to the context
        /*try {
            //this is deprecated so use the next driver rather than this.
            //Class.forName("com.mysql.jdbc.Driver");

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is found successfully");
        }
        catch (ClassNotFoundException e){
            System.out.println("The JDBC driver for MySQL not found!");
            return;
        }*/

        Connection mySqlConnection = null;
        String schema = "sakila";
       /* try {
            //DriverManager.getConnection method automatically loads jdbc drivers within the classpath
            //get connection with providing url, user and password directly
            mySqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + schema, "root", "Mysql_j@v@course_Admin21");
            System.out.printf("Successfully connected to the database and schema: %s", schema);
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
        }*/

       try {
            //DriverManager.getConnection method automatically loads jdbc drivers within the classpath
            //get connection with providing url, and through Property class
            Properties connProperties = new Properties();
            connProperties.put("user", "root");
            connProperties.put("password", "Mysql_j@v@course_Admin21");
            mySqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + schema, connProperties);
            System.out.printf("Successfully connected to the database and schema: %s", schema);
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
        }


    }
}
