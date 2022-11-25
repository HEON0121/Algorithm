package Sort;

public class SelectionSort {

    public static void main(String[] args) {
        int min = 0;
        int temp = 0;
        int index = 0;
        int[] array = {3,4,2,1,5,7,9,8,10,6};        
    
        for(int i = 0; i < array.length; i++){
            min = 99;
            for(int j = i; j < array.length; j++){
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
