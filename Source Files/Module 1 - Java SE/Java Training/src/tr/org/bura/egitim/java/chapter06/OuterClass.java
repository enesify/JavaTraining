package tr.org.bura.egitim.java.chapter06;

public class OuterClass {
    int outerNumber = 12;
    private class InnerClass{
        int innerNumber = 18;
    }

    public int calculateTotal(){
        OuterClass.InnerClass inner = new InnerClass();
        int total = this.outerNumber + inner.innerNumber;
        return total;
    }
}
