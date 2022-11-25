package Sort;

public class BubbleSort {
    // 두 수를 비교해서 당장 더 작은 수를 앞으로 보내는 버블정렬
    // 각 사이클마다 가장 큰 값이 맨 뒤로 이동함
    // 가장 비효율적인 연산 = 실제 수행시간이 가장 느린 알고리즘

    // ex) 10 + 9 + 8 + 7 + ... + 1
    // N * (N+1)/2
    // O(N*N)
    // O(N^2)

    // 버블 정렬은 당장 옆의 자리랑 비교해서 연산 수행하기때문에 선택정렬보다 연산 수행 과정이 더 많음
    // 고로 같은 O(N^2)여도 더 느림

    public static void main(String[] args) {

        int []array = {10,2,5,4,7,8,48,55,76,44,9,1,6,3,11};
        int temp;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length-1-i; j++){
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
