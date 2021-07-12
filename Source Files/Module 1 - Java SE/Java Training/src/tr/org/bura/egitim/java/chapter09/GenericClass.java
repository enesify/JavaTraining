package tr.org.bura.egitim.java.chapter09;

public class GenericClass<T>{
    private T genericObject;

    public GenericClass(T genericObject){
        this.genericObject = genericObject;
    }

    public T getGenericObject(){
        return this.genericObject;
    }

    public <T> Class displayGenericClassName(T type){
        return type.getClass();
    }
}
