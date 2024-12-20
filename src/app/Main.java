package app;

import java.util.Arrays;

public class Main {
    static double[] array;
    static double sumNegativeValues;
    static int countEvenNumbers;
    static int countOddNumbers;
    static double minElement;
    static double maxElement;
    static int maxIndex;
    static int minIndex;
    static boolean findNegativeValues;
    static double summa;
    static double countElements;

    public static void main(String[] args) {

        array = new double[]{58, -74, 23, 66, -11, -22, 36, 25, 88, 4,
                19, -18, -27, 56, -7, 16, 47, -85, 91, 34};

        int arrLength = array.length;
        System.out.println("\n1) Elements of array: " + Arrays.toString(array));
        System.out.println("2) Array length is " + arrLength);

        sumNegativeValues = 0;

        for (double num : array) {
            if (num < 0) {
                sumNegativeValues += num;
            }
        }
        System.out.println("\n3) The sum of negative numbers is " + sumNegativeValues);
    }
}
