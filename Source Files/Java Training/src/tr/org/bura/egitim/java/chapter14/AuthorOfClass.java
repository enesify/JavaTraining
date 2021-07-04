package tr.org.bura.egitim.java.chapter14;


public @interface AuthorOfClass {
    String author() default "Enes Batur";
    String date();
    String version() default "1.0";
}
