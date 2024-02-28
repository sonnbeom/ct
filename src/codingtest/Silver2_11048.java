package codingtest;

import java.util.Scanner;

public class Silver2_11048 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] map = new int[n+1][m+1];
        int[][] dp = new int[n+1][m+1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                map[i][j] = sc.nextInt();
            }
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                dp[i][j] = Math.max(dp[i-1][j]+map[i][j], dp[i][j-1]+map[i][j]);
            }
        }
        System.out.print(dp[n][m]);
    }
}
