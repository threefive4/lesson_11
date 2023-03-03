package ua.lviv.lgs;

import java.util.Arrays;
import java.util.Random;


public class Application {
    public static void main(String[] args) {

        Car[][] arrayOfCarRandom = {
                {new Car("Ferrari", getRandomValueFromRange(100, 200), getRandomValueFromRange(1945, 1990), new Engine("Engine", 2), new Wheel("wheel", 50, "leather"))},
                {new Car("Chevrolet", getRandomValueFromRange(200, 350), getRandomValueFromRange(1960, 1970), new Engine("Engine", 2), new Wheel("wheel", 50, "leather"))}};
        System.out.println(Arrays.deepToString(arrayOfCarRandom));

        Car arrayCar = new Car("Aston Martin Vanquish", 580, 2019, new Engine("Engine", 3), new Wheel("wheel", 45, "rubber"));
        for (Car[] row : arrayOfCarRandom) {
            Arrays.fill(row, arrayCar);
        }
        System.out.println("array = " + Arrays.deepToString(arrayOfCarRandom));
    }

    public static int getRandomValueFromRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("min value must be smaller than max value");
        }

        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
    }
}

