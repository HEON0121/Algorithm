package Sort;

public class CountingSort {
    public static void main(String[] args) {
        int[]arr = new int[100];
        int[]counting = new int[31]; //수의 범위
        int[]result = new int[100];

        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*30);
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("========================");
        System.out.println();
        // 과정 1
        // 배열 arr의 value 값을 index로 하는 counting 배열 값 1씩 카운트
        for(int i =0; i < arr.length; i++){
            counting[arr[i]]++;
        }
        // 과정 2
        // counting 배열 누적 합 해주기..
        for(int i = 1; i < counting.length; i++){
            counting[i] += counting[i-1];
        }

        // 과정 3
        // i 번째 원소를 인덱스로 하는 counting 배열을 1 감소시킨 뒤
        // counting 배열의 값을 인덱스로 하여 result에 value값을 저장한다..
        for(int i = arr.length-1; i>=0; i--){
            int value = arr[i];
            counting[value]--;
            result[counting[value]] = value;
        }



    }


}
