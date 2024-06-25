package algorithm;


import java.util.*;
public class S_D1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int mid = N / 2;
        int[] arr= new int[N];
        for(int i= 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(arr[mid]);
    }
}
