package algorithm;

import java.util.Scanner;

public class S_1859 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int sum = 0;
            for (int j = 0; j < 10; j++) {
                int input = sc.nextInt();
                if (input % 2 != 0){
                    sum += input;
                }
            }
            System.out.print("#"+ i  + " "+sum);
            System.out.println();
        }
    }
}
