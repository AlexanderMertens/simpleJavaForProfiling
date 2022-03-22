package Exercise01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RandomNumbers {
    Scanner sc = new Scanner(System.in);

    public void go() {
        while (true) {
            getArrayOfRandomNumbers();
        }
    }

    private Integer[] getArrayOfRandomNumbers() {
        System.out.println("how many numbers in this array? ");
        int length = sc.nextInt();
        Integer[] numbers = new Integer[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        return numbers;
    }

}
