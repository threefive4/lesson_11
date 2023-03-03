package ua.lviv.lgs;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class RandomNumbers {
    public static void main(String[] args) {
        Integer[] array1 = {45, 5, 845, 546, 59, 1560};
        Arrays.sort(array1);
        System.out.println("in ascending order " + Arrays.toString(array1));
        Arrays.sort(array1, Collections.reverseOrder());
        System.out.println("in descending order " + Arrays.toString(array1));
    }

}
