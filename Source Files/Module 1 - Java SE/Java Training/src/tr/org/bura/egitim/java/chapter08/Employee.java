package tr.org.bura.egitim.java.chapter08;

public class Employee implements Work {
    private String name;
    private String surname;
    private int age;
    private String telephoneNumber;
    private String emailAddress;
    private String department;
    private String title;

    public Employee(String name, String surname, int age, String telephoneNumber, String emailAddress, String department, String title) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.telephoneNumber = telephoneNumber;
        this.emailAddress = emailAddress;
        this.department = department;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    /*public void setName(String name) {
        this.name = name;
    }*/

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public double calculateSalary() {
        return weeklyWorkHour()*getHourlyWage()*4;
    }

    @Override
    public double getHourlyWage() {
        return 100;
    }
}
