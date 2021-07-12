package tr.org.bura.egitim.java.chapter08;

import java.util.*;

public class MapAndHashMap {
    public static void main(String[] args) {
        //-----------------------HashMap Example -1 ----------------------------
        /*Map<String, String> countryMap = new HashMap<>();
        countryMap.put("TR", "TURKEY");
        countryMap.put("AZ", "AZERBAIJAN");
        countryMap.put("USA", "UNITED STATES");
        countryMap.put("UK", "UNITED KINGDOM");

        //countryMap.put("TR", "TURKMENISTAN");

        for (String key : countryMap.keySet()) {
            System.out.println(key + " --> " + countryMap.get(key));
        }

        for (String value : countryMap.values()) {
            System.out.println(value);
        }*/


        //-----------------------HashMap Example -1 ----------------------------
        Employee employee1 = new Employee("Ahmet", "Özer", 32, "05555434343", "ahmetozer@mycompany.com", "IT", "Engineer");
        Employee employee2 = new Employee("Ayşe", "Yılmaz", 43, "05553453467", "ayseyilmaz@mycompany.com", "IT", "Specialist");
        Employee employee3 = new Employee("Hande", "Coşkun", 29, "05325657653", "handecoskun@mycompany.com", "IT", "Analyst");
        Employee employee4 = new Manager("Murat", "Başkanoğlu", 48, "05323203232", "muratbaskanoglu@mycompany.com", "IT", "IT Manager");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        List<Employee> managerList = new ArrayList<>();
        managerList.add(employee4);

        Map<String, List<Employee>> employeeMap = new HashMap<>();
        employeeMap.put("employees", employeeList);
        employeeMap.put("managers", managerList);

       /* for (String key : employeeMap.keySet()) {
            System.out.print(key + " = ");
            for (Employee employee :
                    employeeMap.get(key)) {
                System.out.print(employee.getName() + " " + employee.getSurname() + " ");
            }
            System.out.println();
        }*/

        //----------------------Iterator Example-----------------------
        Iterator<List<Employee>> employeeIterator = employeeMap.values().iterator();
        while(employeeIterator.hasNext()){
            System.out.println(employeeIterator.next());
        }

    }
}
