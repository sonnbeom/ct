import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int centerCount = 0;
        int center = (n+1) / 2;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            int input = sc.nextInt();
            arr[i] = input;
            sum += input;
            if(i == center){
                centerCount = input;
            }
        }
        int min = 0;
        int max = 0;
        for(int i = 0; i <n-1; i++){
            min = Math.min(arr[i], arr[i+1]);
            max = Math.max(arr[i], arr[i+1]);
        }
        // 1. 산술평균
        System.out.println(sum/n);
        // 2. 중앙값
        System.out.println(centerCount);
        // 3. 최빈값

        // 4. 범위
        System.out.println(max - min);

    }
}
/*
* 5 3
* 7 4
* 9 5
* */