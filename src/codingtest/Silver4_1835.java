package codingtest;

import java.util.*;

public class Silver4_1835 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Queue<Integer> q = new LinkedList<>();
    int[] arr = new int[n+1];
        for(int i = 1; i <= n; i++){
        System.out.println(i+"번째 큐는 "+i+"입니다.");
        q.add(i);
    }
    int t = 1;
        while(q.size() > 1){
        for(int i = 0; i < t; i++){
            int poll = q.poll();
            System.out.println(i+"번째");
            System.out.println("poll은 다음과 같습니다"+poll);
            q.add(poll);
        }
        int num = q.poll();
        System.out.println("arr로 간 숫자는"+num);
        arr[t] = num;
        t ++;
    }
    int last = q.poll();
    arr[n] = last;
    StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
        sb.append(arr[i]).append(" ");
    }
        System.out.print(sb);
}
}
