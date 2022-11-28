package Sort;

public class QuickSort {
    // O(N*logN)
    // 분할 정렬 > 큰 문제 하나를 두 개로 나눠서 처리
    // pivot을 설정 (가장 앞의 값)
    public static void main(String[] args) {
        int []array = {10,2,5,4,7,8,48,55,76,44,9,1,6,3,11};
        int min;
        for(int i = 1; i < array.length; i++){
            min = array[0];
            if(min < array[i]){
                min = array[i];
            }

        }
    }
}
