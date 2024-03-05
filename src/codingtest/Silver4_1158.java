package codingtest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Silver4_1158 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            q.add(i);
        }
        while(q.size() > 1){
            for(int i = 0; i < k-1; i++){
                int tmp = q.poll();
                q.add(tmp);
            }
            int poll = q.poll();
            sb.append(poll).append(", ");
        }
        int last = q.poll();
        sb.append(last).append(">");
        System.out.print(sb);
    }
}
