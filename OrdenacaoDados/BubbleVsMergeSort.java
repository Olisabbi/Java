package OrdenacaoDados;

import java.util.Arrays;
import java.util.Random;

public class BubbleVsMergeSort {
    public static void main(String[] args) {
        int[] array = new int[200000]; 
        int[] arrayBubble = new int[200000]; 

        Random random = new Random();
        Random randomBubble = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(Integer.MAX_VALUE);
        }

        for (int i = 0; i < arrayBubble.length; i++) {
            arrayBubble[i] = randomBubble.nextInt(Integer.MAX_VALUE);
        }

        long startTime = System.nanoTime();
        mergeSort(array, 0, array.length - 1);
        long endTime = System.nanoTime();

        System.out.println("Merge Sort executado em: " + (endTime - startTime) / 1e9 + " segundos.");

        startTime = System.nanoTime();
        bubbleSort(arrayBubble);
        endTime = System.nanoTime();

        System.out.println("Bubble Sort executado em: " + (endTime - startTime) / 1e9 + " segundos.");
    }

    public static void bubbleSort(int[] array) {
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            merge(array, left, middle, right);
        }
    }

    public static void merge(int[] array, int left, int middle, int right) {

        int[] L = Arrays.copyOfRange(array, left, middle + 1);
        int[] R = Arrays.copyOfRange(array, middle + 1, right + 1);

        int i = 0, j = 0;


        int k = left;
        while (i < L.length && j < R.length) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < L.length) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < R.length) {
            array[k] = R[j];
            j++;
            k++;
        }
    }
}