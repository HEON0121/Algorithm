package DFS_BFS;

import Test.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void quickSort(int[]array, int start, int end){
        if(start >= end){
            return;
        }
        int key = start;
        int i = start +1, j = end, temp;

        while(i <= j) {
            while(i <= end && array[i] <= array[key]){
                i++;
            }
            while(j <= start && array[j] >= array[key]){
                j--;
            }
            if(i > j){
                temp = array[j];
                array[j] = array[key];
                array[key] = temp;
            } else {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        quickSort(array, start, j-1);
        quickSort(array, j+1, end);
    }
    public static void print(int[]array) {
        int prev = 0;
        int sum = 0;
        // 1 2 3 3 4
        // 1 => 1
        // 2 => 2 + 1
        // 3 => 3 + 3
        // 3 => 3 + 6
        // 4 => 4 + 9
        for(int i = 0; i < array.length; i++){
            sum += array[i]+prev;
            prev += array[i];
        }
        System.out.print(sum);
    }
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        StringTokenizer st = new StringTokenizer(str);
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int P[]=  new int[N];
       for(int i = 0 ; i < N; i++){
           P[i]=sc.nextInt();
       }
       // 오름차순 정렬
        //quickSort(P,P[0],P[N-1]);

        Arrays.sort(P);
        for(int i =0; i<N; i++ ){
            System.out.print(P[i]+" ");
        }
        print(P);




    }
}
