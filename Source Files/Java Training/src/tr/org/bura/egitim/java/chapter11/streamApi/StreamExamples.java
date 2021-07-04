package tr.org.bura.egitim.java.chapter11.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {
    public static void main(String[] args) {
        List<String> hardwarelist = new ArrayList<>();
        hardwarelist.add("Case");
        hardwarelist.add("Motherboard");
        hardwarelist.add("CPU");
        hardwarelist.add("RAM");
        hardwarelist.add("GPU");
        hardwarelist.add("Disk");
        hardwarelist.add("Keyboard");
        hardwarelist.add("Mouse");
        hardwarelist.add("Monitor");

        //write each element of the list through for-each loop
        System.out.println("write each element of the list through for-each loop");
        for (String hardwareElement :
                hardwarelist) {
            System.out.println(hardwareElement);
        }

        //write each element of the list through classical for loop
        System.out.println("write each element of the list through classical for loop");
        for (int i = 0; i < hardwarelist.size(); i++) {
            System.out.println(hardwarelist.get(i));
        }

        /*hardwarelist.forEach((hardwareElement) -> {
            System.out.println(hardwareElement);
        });*/
        System.out.println("write each element of the list through stream api and lambda expression");
        hardwarelist.forEach(System.out::println);

        System.out.println("--filter-------------------------------");
        //stream filter example
        List<String> filteredList = hardwarelist.stream().filter(hardwareElement -> hardwareElement.contains("PU")).collect(Collectors.toList());
        filteredList.forEach(filteredItem -> System.out.println(filteredItem));
        filteredList.forEach(System.out::println);

        System.out.println("--map-------------------------------");
        //stream map example
        //List<String> uppercaseHardwareList = hardwarelist.stream().map(String::toUpperCase).collect(Collectors.toList());
        hardwarelist.stream().map(String::toUpperCase).forEach(StreamExamples::display);
        //the above code is equivalent to below, the display method reference is user defined.
        hardwarelist.stream().map(String::toLowerCase).forEach(System.out::println);
        //uppercaseHardwareList.forEach(System.out::println);

        //sorted example
        System.out.println("--sorted-------------------------------");
        hardwarelist.stream().sorted(String::compareToIgnoreCase).forEach(System.out::println);

        System.out.println();
        for (String hardwareItem :
                hardwarelist) {
            System.out.println(hardwareItem);;
        };

        System.out.println("--match-------------------------------");
        //match example
        boolean isItemStartsWithG = hardwarelist.stream().anyMatch(hardwareItem -> hardwareItem.startsWith("G"));
        System.out.println(isItemStartsWithG);
        boolean isEveryItemStartsWithA = hardwarelist.stream().allMatch(hardwareItem -> hardwareItem.startsWith("A"));
        System.out.println(isEveryItemStartsWithA);
        boolean isAllItemsNotStartsWithT = hardwarelist.stream().noneMatch(hardwareItem -> hardwareItem.startsWith("C"));
        System.out.println(isAllItemsNotStartsWithT);
    }

    public static void display(String item){
        System.out.println(item);
    }
}
