package tr.org.bura.egitim.java.chapter16.jdbcInsertExamples;

import tr.org.bura.egitim.java.chapter16.util.SqlConnectionUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class InsertExamples {
    public static void main(String[] args) {

        try (Statement insertStatement = SqlConnectionUtil.getConnection("sakila").createStatement()) {
            insertStatement.execute("INSERT INTO CITY (CITY_ID, CITY, COUNTRY_ID, LAST_UPDATE ) VALUES (998, 'Metro City', 97, '2021-07-15 04:45:25')");
            System.out.println("Inserted successfully!");
        }
        catch (SQLException e){
            System.out.println("Could not execute the statement. Error: " + e.getMessage());
        }
    }
}
