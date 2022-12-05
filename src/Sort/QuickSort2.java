package Sort;

public class QuickSort2 {
    private static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length-1);
    }

    private static void quickSort(int[] arr, int start, int end){
        int pivot = partition(arr, start, end);
        if(start < pivot - 1){
            quickSort(arr, start, pivot - 1);
        }
        if(pivot < end) {
            quickSort(arr, pivot, end);
        }
    }
    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];
        while (start <= end) {
            while (arr[start] < pivot) start++;
            while (arr[end] > pivot) end--;
            if(start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }
    private static void swap(int[] arr, int start, int end) {
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
    }

    private static void printArray(int[] arr) {
        for (int data : arr) {
            System.out.print(data + ", ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int []array = {10,10,2,5,4,7,8,48,55,76,44,9,1,6,3,11};
        quickSort(array);
        printArray(array);
    }
}
