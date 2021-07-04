package tr.org.bura.egitim.java.chapter08;

public class Manager extends Employee{
    public Manager(String name, String surname, int age, String telephoneNumber, String emailAddress, String department, String title) {
        super(name, surname, age, telephoneNumber, emailAddress, department, title);
    }

    @Override
    public double calculateSalary() {
        return weeklyWorkHour()*getHourlyWage()*4;
    }

    @Override
    public double getHourlyWage() {
        return 250;
    }

    @Override
    public double weeklyWorkHour() {
        return dailyWorkHour*4.5;
    }
}
