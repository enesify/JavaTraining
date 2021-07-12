package tr.org.bura.egitim.java.chapter08;

import java.util.*;

public class SetAndHashSet {
    public static void main(String[] args) {
        //----------------------HashSet example - 1 -------------------------------------
        Set<Integer> numberSet = new HashSet<>();

        numberSet.add(2);
        numberSet.add(12);
        numberSet.add(23);
        System.out.println(numberSet.add(20));


       /* System.out.println("Size of the numberSet: " + numberSet.size());

        for (Integer number :
                numberSet) {
            System.out.println(number);
        }

        System.out.println(numberSet);*/

        //----------------------HashSet example - 1 -------------------------------------
      /*  Employee employee1 = new Employee("Ahmet", "Özer", 32, "05555434343", "ahmetozer@mycompany.com", "IT", "Engineer");
        Employee employee2 = new Employee("Ayşe", "Yılmaz", 43, "05553453467", "ayseyilmaz@mycompany.com", "IT", "Specialist");
        Employee employee3 = new Employee("Hande", "Coşkun", 29, "05325657653", "handecoskun@mycompany.com", "IT", "Analyst");
        Employee employee4 = new Manager("Murat", "Başkanoğlu", 48, "05323203232", "muratbaskanoglu@mycompany.com", "IT", "IT Manager");
        Employee employee5 = new Employee("Ahmet", "Özer", 32, "05555434343", "ahmetozer@mycompany.com", "IT", "Engineer");

        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        employeeSet.add(employee4);
        employeeSet.add(employee1);
        employeeSet.add(employee5);

        System.out.println(employeeSet.size());

        for (Employee employee :
                employeeSet) {
            System.out.println(employee);
        }*/
        //--------------------get a specific element of the HashSet------------
        /*boolean isHashSetContainsNumber = numberSet.contains(2);

        if (numberSet.contains(2)){
            List<Integer> numberList = new ArrayList<>(numberSet);

            System.out.println(numberList.get(1));
        }*/


        //--------------------converting HashSet to Array Example---------------
      /*  Integer[] numbers = numberSet.toArray(new Integer[numberSet.size()]);
        int[] a = new int[numbers.length];

        for (int i = 0; i< numbers.length; i++){
            a[i] = numbers[i];
        }*/

        //----------------Iterator Example---------------------------------

        Iterator<Integer> numSetIterator = numberSet.iterator();
        while(numSetIterator.hasNext()){
            System.out.println(numSetIterator.next());
        }
    }
}
