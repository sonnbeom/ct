package algorithm;

import java.util.Scanner;

public class S_1206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int temp = N;
        int length = 0;
        while (temp > 0){
            temp /= 10;
            length++;
        }
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += N % 10;
            int t = N /10;
            N = t;
        }
        System.out.println(sum);


    }
}
