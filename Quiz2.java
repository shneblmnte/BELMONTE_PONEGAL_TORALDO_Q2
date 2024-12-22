//Roxane S. Ponegal - Code.

import java.util.Arrays;
import java.util.Scanner;

public class Quiz2 {

    // Bubble Sort (Ascending Order)
    public static void bubbleSort(int[] arr, boolean ascending) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if ((ascending && arr[j] > arr[j + 1]) || (!ascending && arr[j] < arr[j + 1])) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    // Selection Sort (Descending Order)
    public static void selectionSort(int[] arr, boolean ascending) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int targetIndex = i;
            for (int j = i + 1; j < n; j++) {
                if ((ascending && arr[j] < arr[targetIndex]) || (!ascending && arr[j] > arr[targetIndex])) {
                    targetIndex = j;
                }
            }
            swap(arr, targetIndex, i);
        }
    }

    // Swap method for reusability
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Calculate sum of even or odd numbers
    public static int sumNumbers(int[] arr, boolean even) {
        return Arrays.stream(arr)
                .filter(x -> even ? x % 2 == 0 : x % 2 != 0)
                .sum();
    }

    // Get minimum or maximum power level
    public static int getExtremeValue(int[] arr, boolean findMin) {
        return findMin ? Arrays.stream(arr).min().orElse(0) : Arrays.stream(arr).max().orElse(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] powerLevels = new int[10];

        // Input: Power levels of 10 creatures
        System.out.println("Enter 10 power levels of creatures:");
        for (int i = 0; i < 10; i++) {
            powerLevels[i] = scanner.nextInt();
        }

        // Bubble Sort (Ascending Order)
        bubbleSort(powerLevels, true);
        System.out.println("\nBubble Sort (Ascending):");
        printArray(powerLevels);

        // Selection Sort (Descending Order)
        selectionSort(powerLevels, false);
        System.out.println("\nSelection Sort (Descending):");
        printArray(powerLevels);

        // Analysis
        int evenSum = sumNumbers(powerLevels, true);
        int oddSum = sumNumbers(powerLevels, false);
        int minPower = getExtremeValue(powerLevels, true);
        int maxPower = getExtremeValue(powerLevels, false);

        System.out.println("\n\nAnalysis:");
        System.out.println("Sum of Even Numbers: " + evenSum);
        System.out.println("Sum of Odd Numbers: " + oddSum);
        System.out.println("Minimum Power Level: " + minPower);
        System.out.println("Maximum Power Level: " + maxPower);

        scanner.close();
    }

    // Print array method for consistency
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}