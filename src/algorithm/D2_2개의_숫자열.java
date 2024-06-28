package algorithm;

import java.util.*;
public class D2_2개의_숫자열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arrFi = new int[n];
            int[] arrSe = new int[n];

            for(int j = 0; j < n; j++){
                arrFi[j] = sc.nextInt();
            }

            for (int j = 0; j < m; j++) {
                arrSe[j] = sc.nextInt();
            }
            int diff = 0;
            int leng = 0;
            if (n > m){
                diff = n - m;
                leng = m;
            }else {
                diff = m - n;
                leng = n;
            }
            int max = 0;

            System.out.println("#"+i+" "+max);
        }
    }
}
