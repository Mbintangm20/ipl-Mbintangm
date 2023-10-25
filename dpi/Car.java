package dpi;

public class Car {
    private final EngineInterface engine;
    public Car(EngineInterface engine){
        this.engine = engine;
    }
    void start(){
        engine.start();
    }
}