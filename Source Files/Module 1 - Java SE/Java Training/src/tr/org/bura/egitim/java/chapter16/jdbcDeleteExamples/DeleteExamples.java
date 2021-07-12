package tr.org.bura.egitim.java.chapter16.jdbcDeleteExamples;

import tr.org.bura.egitim.java.chapter16.util.SqlConnectionUtil;

import java.sql.Statement;

public class DeleteExamples {
    public static void main(String[] args) {
        try (Statement deleteStatement = SqlConnectionUtil.getConnection("sakila").createStatement()) {
            //deleteStatement.execute("DELETE FROM CITY WHERE CITY_ID = 998");
            int deletedId = 999;
            deleteStatement.execute("DELETE FROM CITY WHERE CITY_ID = " + deletedId);
            System.out.println("Successfully deleted!");
        } catch (Exception e) {
            System.out.println("Could not execute the statement. Error: " + e.getMessage());
        }
    }
}
