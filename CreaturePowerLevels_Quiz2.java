//Sophia Jessica C. Toraldo - Code.

import java.util.Scanner;

public class CreaturePowerLevels_Quiz2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] powerLevels = new int[10];

        // Input the Power Levels (of 10 creatures)
        System.out.println("Enter 10 power levels of creatures:");
        for (int i = 0; i < 10; i++) {
            powerLevels[i] = scanner.nextInt(); // Store in an integer array
        }

        // Bubble Sort Implementation (in ascending order)
        bubbleSort(powerLevels);
        System.out.println("\nBubble Sort (Ascending):");
        for (int power : powerLevels) {
            System.out.print(power + " "); // Display the sorted list
        }

        // Selection Sort Implementation (in descending order)
        selectionSortDescending(powerLevels);
        System.out.println("\n\nSelection Sort (Descending):");
        for (int power : powerLevels) {
            System.out.print(power + " "); // Display the sorted list
        }
        
        scanner.close();

        // Calculate and Display Analysis
        int sumEven = 0, sumOdd = 0;
        int min = powerLevels[0], max = powerLevels[0];
        for (int power : powerLevels) {
            if (power % 2 == 0) { 
                sumEven += power; // Calculate the sum of even power levels
            } else {
                sumOdd += power; // Calculate the sum of odd power levels
            }
            // Calculate the minimum and maximun power levels
            if (power < min) {
                min = power;
            }
            if (power > max) {
                max = power;
            }
        }

        // Display the Analysis
        System.out.println("\n\nAnalysis:");
        System.out.println("Sum of Even Numbers: " + sumEven);
        System.out.println("Sum of Odd Numbers: " + sumOdd);
        System.out.println("Minimum Power Level: " + min);
        System.out.println("Maximum Power Level: " + max);
    }

    // Bubble Sort Algorithm (in ascending order)
    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort Algorithm (in descending order)
    private static void selectionSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
        }
    }
}