package DFS_BFS;

import Test.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

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
            while(array[i]-- > 0) {
                sum += (i + prev);
                prev += i;
            }
        }
        System.out.print(sum);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());//Integer.parseInt(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int[]coins = new int[N];

        for(int i = 0; i < N; i++){
            coins[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for(int i = N-1; i >= 0; i--){
            count += K/coins[i];
            K = K%coins[i];

        }
        System.out.print(count);
       // StringTokenizer st = new StringTokenizer(br.readLine(), " ");
  //     Scanner sc = new Scanner(System.in);
//       int N = sc.nextInt();
       //int P[]=  new int[1001];
//       while(N-- > 0){
//           P[Integer.parseInt(st.nextToken())]++;
//       }
//       for(int i = 0; i < P.length; i++){
//           System.out.println("P["+i+"] : "+P[i]);
//       }
       // 오름차순 정렬
        // 계수 정렬로 해보자..
        //print(P);

        //int[]arr = new int[N];



    }
}
