package tr.org.bura.training.java.decouplingExample;

public class ElectricEngine implements Engine{
    @Override
    public String start() {
        return "Electric Engine started.";
    }
}
