package Exercise01;

import java.util.ArrayList;
import java.util.Scanner;

public class RandomNumbers {
    ArrayList<int[]> listOfAllArrays = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void go() {
        while (true) {
            int[] arrayOfRandomNumbers = getArrayOfRandomNumbers();
            listOfAllArrays.add(arrayOfRandomNumbers);
            //System.out.println("list of all arrays: "+ listOfAllArrays);
        }
    }

    private int[] getArrayOfRandomNumbers() {
        System.out.println("how many numbers in this array? ");
        int length = sc.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = ((int) (Math.random() * 100));
        }
        return numbers;
    }

}

