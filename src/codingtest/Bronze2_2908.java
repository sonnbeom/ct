package codingtest;

import java.util.Scanner;

public class Bronze2_2908 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int fi = (a%10) * 100 + ((a%100) / 10) * 10 + (a/100);
        int se = (b%10) * 100 + ((b%100) / 10) * 10 + (b/100);

        if(fi> se){
            System.out.print(fi);
        }else{
            System.out.print(se);
        }
    }
}
