package tr.org.bura.egitim.java.chapter08;

import java.util.*;

public class ListAndArrayList {
    public static void main(String[] args) {
        //----------List & ArrayList Example - 1 -------------------------------------
        List<String> studentList = new ArrayList<>();
        studentList.add("Hasan");
        studentList.add("Merve");
        studentList.add("Osman");
        studentList.add("Seda");

      //  System.out.println(studentList.contains("Ali"));

        studentList.set(1, "Selin");


      //  System.out.println(studentList.get(0));
        studentList.remove("Ali");

      //  System.out.println(studentList);
      //  Collections.sort(studentList, Collections.reverseOrder());
      //  System.out.println(studentList);
        //studentList.isEmpty();
       // studentList.clear();

        for (String student :
                studentList) {
     //       System.out.println(studentList.indexOf(student) + "-->" + student);
        }

       // List<Integer> numberList = new ArrayList<>();
       // numberList.add(3);

        //----------Converting ArrayList to Array Example --------------------------
        String[] names = studentList.toArray(new String[studentList.size()]);
      //  System.out.println(names.length);
        //String[] newArrays = Arrays.copyOf(names, 10);
        for (String name :
                names) {
       //     System.out.println(name);
        }

        //---------Converting Array to ArrayList Example - 1 ----------------------------
        /*Employee employee1 = new Employee("Ahmet", "Özer", 32, "05555434343", "ahmetozer@mycompany.com", "IT", "Engineer");
        Employee employee2 = new Employee("Ayşe", "Yılmaz", 43, "05553453467", "ayseyilmaz@mycompany.com", "IT", "Specialist");
        Employee employee3 = new Employee("Hande", "Coşkun", 29, "05325657653", "handecoskun@mycompany.com", "IT", "Analyst");
        Employee employee4 = new Manager("Murat", "Başkanoğlu", 48, "05323203232", "muratbaskanoglu@mycompany.com", "IT", "IT Manager");

        Employee[] employees = {employee1, employee2, employee3, employee4};

        System.out.println("Printing salaries on Array");
        for (Employee employee :
                employees) {
            System.out.println("Salary of " + employee.getName() + " " + employee.getSurname() + " is: " + employee.calculateSalary());
        }

        List<Employee> employeeList = Arrays.asList(employees);

        System.out.println("Printing salaries on List");
        for (Employee employeeItem :
                employeeList) {
            System.out.println("Salary of " + employeeItem.getName() + " " + employeeItem.getSurname() + " is: " + employeeItem.calculateSalary());
        }

        //---------Converting Array to ArrayList Example - 2 ----------------------------
        String[] languages = {"Java", "Javascript", "C++", "Python"};

        for (String language :
                languages) {
            System.out.println(language);
        }

        System.out.println("------------------------------------");

        List<String> languageList = Arrays.asList(languages);

        for (String languageItem:
             languageList) {
            System.out.println(languageItem);
        }

        System.out.println(languageList.indexOf("Javascript"));*/

        //List<boolean>

        //---------------Iterator Example --------------------------

        Iterator<String> studentIterator = studentList.iterator();
        while(studentIterator.hasNext()){
            System.out.println(studentIterator.next());
        }

    }
}
