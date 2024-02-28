package codingtest;

import java.util.*;
public class Silver4_18110 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] =sc.nextInt();
        }
        Arrays.sort(arr);
        int num = (int)Math.round(n*15/100);
        double sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        int answer = (int)Math.round(sum/(n-2*num));
        System.out.print(answer);
    }
}
