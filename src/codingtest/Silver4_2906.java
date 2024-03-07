package codingtest;

import java.util.Scanner;

public class Silver4_2906 {
    static int N;
    static int K;
    static boolean[] check;

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        check = new boolean[N+1];
        primeNumber();

    }
    static void primeNumber(){
        for(int i = 2; i <= N; i++){
            if(!check[i]){
                for(int j = i; j <= N; j+=i){
                    check[j] = true;
                    K--;
                    if(K == 0){
                        System.out.print(j);
                        return;
                    }
                }
            }
        }
    }
}
