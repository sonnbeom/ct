package codingtest;

import java.util.Scanner;

public class Silver4_1748 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int plus = 1;
        int num = 10;
        for(int i = 1; i <= n; i++){
            if(i % num == 0){
                plus++;
                num *= 10;
            }
            count += plus;
        }
        System.out.print(count);
    }

}
