package ua.lviv.lgs;

public class Engine {
    private String engine;
    private int numOfCylinders;


    public Engine(String engine, int numOfCylinders) {
        this.engine = engine;
        this.numOfCylinders = numOfCylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engine='" + engine + '\'' +
                ", numOfCylinders=" + numOfCylinders +
                '}';
    }
}
