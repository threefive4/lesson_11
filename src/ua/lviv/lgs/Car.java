package ua.lviv.lgs;

public class Car {
    private String car;
    private int numOfHorsepower;
    private int yearOfManufacture;

    private Engine engine;
    private Wheel wheel;

    public Car(String car, int numOfHorsepower, int yearOfManufacture, Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;

        this.car = car;
        this.numOfHorsepower = numOfHorsepower;
        this.yearOfManufacture = yearOfManufacture;

    }

    @Override
    public String toString() {
        return "Car{" +
                "car='" + car + '\'' +
                ", numOfHorsepower=" + numOfHorsepower +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
