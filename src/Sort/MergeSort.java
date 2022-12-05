package Sort;

public class MergeSort {
    // 배열을 둘로 나눈다
    // 맨 앞의 수를 비교해서 정렬
    // O(n * log n)
    // 별도로 저장 공간이 없을 시 퀵 정렬
    private static void mergeSort(int[] arr) {

    }
    private static void mergeSort(int[] arr, int[]tmp, int start, int end) {
        if(start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, tmp, start, mid);
            mergeSort(arr, tmp, mid+1, end);
            merge(arr, tmp, start, mid, end);
        }
    }

    private static void merge(int[] arr, int[] tmp, int start, int mid, int end) {
        for(int i = start; i <= end; i++){
            tmp[i] = arr[i];
        }
        int part1 = start;
        int part2 = mid + 1;
        int index = start;
        while (part1 <= mid && part2 <= end) {
            if(tmp[part1] <= tmp[part2]) {
                arr[index] = tmp[part1];
                part1++;
            }else {
                arr[index] = tmp[part2];
                part2++;
            }
            index++;
        }
        for(int i = 0; i <= mid -part1; i++) {
            arr[index + i] = tmp[part1 + i];
        }
    }
    public static void main(String[] args) {

    }

}
