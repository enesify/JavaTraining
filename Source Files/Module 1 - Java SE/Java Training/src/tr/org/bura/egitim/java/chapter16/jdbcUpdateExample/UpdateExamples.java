package tr.org.bura.egitim.java.chapter16.jdbcUpdateExample;

import tr.org.bura.egitim.java.chapter16.util.SqlConnectionUtil;

import java.sql.Statement;

public class UpdateExamples {
    public static void main(String[] args) {
        try (Statement updateStatement = SqlConnectionUtil.getConnection("sakila").createStatement()) {
            updateStatement.execute("UPDATE CITY SET CITY = 'Super City', LAST_UPDATE = '2021-07-10 14:51:58' WHERE CITY_ID = 999");
            System.out.println("Successfully updated!");
        } catch (Exception e) {
            System.out.println("Could not execute the statement. Error: " + e.getMessage());
        }
    }
}
