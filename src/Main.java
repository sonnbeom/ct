import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n+1];
        boolean[] visited = new boolean[n+1];
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            arr[i] = i;
        }
        int t = 0;
        int i = 0;
        while(t != n){
           if(!visited[i+1]){
               i += 1;
           }
           if(i == 3)
        }
    }

}
