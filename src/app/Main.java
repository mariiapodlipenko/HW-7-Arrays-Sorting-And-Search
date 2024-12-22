package app;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] intArray = new int[15];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 100) + 1;
        }

        System.out.println("Primary array: " + Arrays.toString(intArray));

        for (int i = 1; i < intArray.length; i++) {
            int key = intArray[i];
            int j = i - 1;
            while (j >= 0 && intArray[j] > key) {
                intArray[j + 1] = intArray[j];
                j--;
            }
            intArray[j + 1] = key;
        }
        System.out.println("Sorted array:" + Arrays.toString(intArray));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input int number: ");

        int key = scanner.nextInt();
        int low = 0;
        int high = intArray.length - 1;
        int idx = -1;

        while (low <= high) {
            int middle = (low + high) / 2;

            if (intArray[middle] == key) {
                idx = middle;
                break;
            } else if (intArray [middle] > key) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }

        if (idx == -1)
            System.out.println("Value " + key + " is absent.");
        else
            System.out.println("Index of value " + key + " in sorted array: " + idx);

    }
}
