package tr.org.bura.training.java.decouplingExample;

public class DieselEngine implements Engine{
    @Override
    public String start() {
        return "Diesel Engine started";
    }
}
