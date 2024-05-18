package basics;

import java.util.Arrays;

public class SortingAlgos {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 1, 3, 9, 7};
        insertionSort(arr, 5);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // replace sorted position with min element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void bubbleSort(int [] arr, int n){
        for(int i=0;i<n-1;i++){
            boolean swapped = false;
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void insertionSort(int []arr, int n){
        for (int i=1;i<n;i++){
            int curr = arr[i];
            int j = i-1;
            while (j>=0&&arr[j]>curr){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
    }
}
