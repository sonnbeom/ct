import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean[] visited = new boolean[2000001];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int t = sc.nextInt();
            arr[i] = t ;
            map.put(t, t);
        }
        int x = sc.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++){
            int diff =  x - arr[i];
            if(map.containsKey(diff)){
                count ++;
            }
        }
        System.out.print(count);
    }
}
