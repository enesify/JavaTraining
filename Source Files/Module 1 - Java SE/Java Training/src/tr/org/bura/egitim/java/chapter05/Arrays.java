package tr.org.bura.egitim.java.chapter05;

public class Arrays {
    public static void main(String[] args) {
        //------------ arrays example -1 ------------------------
        /*int[] age = {12, 4, 5, 2, 5};

        // access each array elements
        System.out.println("Accessing Elements of Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);

        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }

        for (int element : age) {
            System.out.println(element);
        }*/

        //------------ arrays example -1 ------------------------
        int[][] exams = {
                {70, 58, 83},
                {74, 95, 60},
                {37},
                {67, 49}
        };

        for (int i = 0; i < exams.length; i++) {
            for (int j = 0; j < exams[i].length; j++) {
                System.out.print(exams[i][j] + ", ");
            }
            System.out.println("");
        }

    }
}
