//Shane Mae T. Belmonte - Code

import java.util.Scanner;

public class CreaturePowerLevels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] powerLevels = new int[10]; //Maximum of 10 integers for power level.

        System.out.println("Enter power levels of 10 creatures:");
        for (int i = 0; i < powerLevels.length; i++) {
            powerLevels[i] = scanner.nextInt();
        }

        bubbleSortAscending(powerLevels); //Bubble Sorting - Ascending.
        System.out.println("\nBubble Sort (Ascending):");
        printArray(powerLevels);

        selectionSortDescending(powerLevels); //Selection Sorting - Descending.
        System.out.println("\nSelection Sort (Descending):");
        printArray(powerLevels);

        scanner.close();

        //Loop for the Even and Odd Conditions, using if-else.
        int sumEven = 0, sumOdd = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int powerLevel : powerLevels) {
            if (powerLevel % 2 == 0) {
                sumEven += powerLevel;
            } else {
                sumOdd += powerLevel;
            }
            if (powerLevel < min) {
                min = powerLevel;
            }
            if (powerLevel > max) {
                max = powerLevel;
            }
        }
        
        //Display Data.
        System.out.println("\nAnalysis:");
        System.out.println("Sum of Even Numbers: " + sumEven);
        System.out.println("Sum of Odd Numbers: " + sumOdd);
        System.out.println("Minimum Power level: " + min);
        System.out.println("Maximum Power level: " + max);
    }

    public static void bubbleSortAscending(int[] arr) { //Bubble Sorting - Ascending.
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSortDescending(int[] arr) { //Selection Sorting - Descending.
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}