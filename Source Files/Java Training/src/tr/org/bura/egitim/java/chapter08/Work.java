package tr.org.bura.egitim.java.chapter08;

public interface Work {
    int dailyWorkHour = 9;
    public double calculateSalary();
    public double getHourlyWage();
    public default double weeklyWorkHour(){
        return dailyWorkHour*5;
    }
}
