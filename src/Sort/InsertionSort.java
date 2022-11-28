package Sort;

public class InsertionSort {
    // 삽입 정렬은 각 숫자를 적절한 위치에 삽입하는 방법
    // '필요할 때만' 위치 변경
    // 앞의 정렬된 요소들과 비교해서 적절한 위치에 삽입
    // 데이터가 이미 정렬된 한해서는 어떤 정렬보다 빠름

    // ex) 10 + 9 + 8 + 7 + ... + 1
    // N * (N+1)/2
    // O(N*N)
    // O(N^2)

    public static void main(String[] args) {

        int []array = {10,2,5,4,7,8,48,55,76,44,9,1,6,3,11};
        int temp;
        for(int i = 0; i < array.length-1; i++){
            while(i >= 0 && array[i] > array[i+1]){
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                i--;
            }
        }

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
