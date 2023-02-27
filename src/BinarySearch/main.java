package BinarySearch;

public class main {
    //이진탐색 시간복잡도 : O(logN)
    //정렬된 특정 범위 탐색하는거임
    //막 0부터 10억 사이 이러면 이진탐색 큐

    public static int binarySearch(int[]arr, int start, int end, int target){
        int mid = (start+end)/2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] > target){
            end = mid-1;
            return binarySearch(arr, start, end, target);

        }else {
            start = mid+1;
            return binarySearch(arr, start, end, target);
        }

    }
    public static void main(String[] args) {
        int arr[] = {0,4,6,8,9,10,12};
        int target = 9;
        int result = binarySearch(arr, 0, 6, 4 );
        System.out.print(result);
    }
}
