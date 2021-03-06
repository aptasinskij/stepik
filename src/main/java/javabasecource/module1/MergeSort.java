package javabasecource.module1;

/**
 * Created by andrew on 26.12.16.
 */
public class MergeSort {

    private int[] numbers;
    private int[] helper;

    private int number;

    public void sort(int[] values){
        this.numbers = values;
        number = values.length;
        this.helper = new int[number];
        mergeSort(0, number - 1);
    }

    private void mergeSort(int low, int high) {
        int middle = low + (high - low) / 2;
        mergeSort(low, middle);
        mergeSort(middle + 1, high);
        merge(low, middle, high);
    }

    private void merge(int low, int middle, int high) {

        for (int i = low; i <= high; i++){
            helper[i] = numbers[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;

        while (i <= middle && j <= high){
            if (helper[i] <= numbers[j]){
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }

        while (i <= middle){
            numbers[k] = helper[i];
            k++;
            i++;
        }

    }


}
