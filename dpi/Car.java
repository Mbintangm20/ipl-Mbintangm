package dpi;

public class Car {
    private final Engine engine;
    public Car(Engine engine){
        this.engine = engine;
    }
    void start(){
        engine.start();
    }
}