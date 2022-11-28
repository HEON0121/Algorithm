package Sort;

public class QuickSort {
    // O(N*logN) > 최적
    // O(N^2) > 최악
    // 대부분에선 가장빠름..
    // 분할 정렬 > 큰 문제 하나를 두 개로 나눠서 처리
    // pivot을 설정 (가장 앞의 값)
    static void show(int[] data){
        for(int i = 0; i < data.length; i++){
            System.out.println(data[i]);
        }

    }
    static void quickSort(int[] data, int start, int end) {
        if(start >= end){ // 원소가 1개인 경우
            return;
        }
        int key = start; // 키는 첫번째 원소
        int i = start + 1, j = end, temp;

        while(i <= j) { // 엇갈릴 때까지 반복
            while(i <= end && data[i] <= data[key]){ // 키 값보다 큰 값을 만날 때까지
                i++;
            }
            while(j > start && data[j] >= data[key]){ // 키 값보다 작은 값을 만날 때까지
                j--;
            }
            if(i > j){ // 엇갈린 상태면 키 값과 교체
                temp = data[j];
                data[j] = data[key];
                data[key] = temp;
            } else { // 엇갈리지 않았다면 i와 j를 교체
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }

        quickSort(data, start, j - 1);
        quickSort(data, j + 1, end);
    }

    public static void main(String[] args) {
        int []array = {10,2,5,4,7,8,48,55,76,44,9,1,6,3,11};
        quickSort(array, 0, array.length-1);
        show(array);
    }

}
