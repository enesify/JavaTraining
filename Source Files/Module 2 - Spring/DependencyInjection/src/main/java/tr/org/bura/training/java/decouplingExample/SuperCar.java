package tr.org.bura.training.java.decouplingExample;

public class SuperCar implements Car{

    Engine engine;
    //this is known as constructor injection;
    public SuperCar (Engine engine){
        this.engine = engine;
    }

    //this is called setter injection
    public void setEngine(Engine engine){
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.println(engine.start());
    }
}
