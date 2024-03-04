package codingtest;

import java.util.*;
public class Silver5_11866 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            q.add(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while(q.size() > 1){
            for(int i = 0; i < k-1; i++){
                int v = q.poll();
                q.add(v);
            }
            sb.append(q.poll()).append(", ");
        }
        sb.append(q.poll()).append(">");
        System.out.print(sb);
    }
}
