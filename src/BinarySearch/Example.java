package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class Example {
    // 1 <= N <= 1,000,000
    // -10^9 <= x <= 10^9
    // 오름차순 된 순열에서 x의 개수 출력


    // Lower Bound: 일치하는 숫자가 처음 나타나는 지점
    private static int LowerBound(int arr[], int target) {
        int l = 0;
        int r = arr.length;
        int mid = 0;
        while (l < r) {
            mid = (l + r) / 2;
            // l mid target r
            if (arr[mid] < target)
                l = mid + 1;
            else
                r = mid;
        }
        return r;
    }

    // Upper Bound: 일치하는 숫자 다음 수 나타나는 지점
    private static int UpperBound(int arr[], int target) {
        int l = 0;
        int r = arr.length;
        int mid = 0;

        while (l < r) {
            mid = (l + r) / 2;
            if (arr[mid] <= target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return r;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());//Integer.parseInt(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int []arr = new int[N];
        // 랜덤값 생성
        //Random rand = new Random();
        StringTokenizer element = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(element.nextToken());
        }
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        int target = X;
        int rightIndex = UpperBound(arr, target);
        int leftIndex = LowerBound(arr, target);
        // 중복된 요소 개수 출력
        int result = rightIndex-leftIndex;
        System.out.print(result);
    }
}
