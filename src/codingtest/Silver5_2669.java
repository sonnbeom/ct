package codingtest;

import java.util.Scanner;

public class Silver5_2669 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int[][] map = new int[101][101];
        for (int i = 0; i < 4; i++) {
            int lx = sc.nextInt();
            int ly = sc.nextInt();
            int rx = sc.nextInt();
            int ry = sc.nextInt(); // 3
            for (int y = ly; y < ry; y++) {
                for (int x = lx; x < rx; x++) {
                    map[y][x] = 1;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                if (map[i][j] == 1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
