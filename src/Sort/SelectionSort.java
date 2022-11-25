package Sort;

public class SelectionSort {

    public static void main(String[] args) {


        // ex) 10 + 9 + 8 + 7 + ... + 1
        // N * (N+1)/2
        // O(N*N)
        // O(N^2)

        int []array = {10,2,5,4,7,8,48,55,76,44,9,1,6,3,11};
        int index=0;
        int temp;
        int min;
        for(int i = 0; i < array.length; i++){
            min = 9999;
            for(int j = i; j<array.length; j++){
                if(min > array[j]){
                    min = array[j];
                    index = j;
                }
            }
            temp = array[i];
            array[i] = min;
            array[index] = temp;
        }
        for(int i = 0; i < array.length; i++){
           System.out.println(array[i]);
        }
    }
    
}
