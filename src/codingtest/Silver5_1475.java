package codingtest;

import java.util.*;
public class Silver5_1475 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int[] arr = new int[10];
        for(int i = 0; i < n.length(); i++){
            String s = n.substring(i,i+1);
            int num = Integer.parseInt(s);
            if(num == 9){
                num = 6;
            }
            arr[num]++;
        }
        arr[6] = arr[6] / 2 + arr[6] % 2;
        Arrays.sort(arr);
        System.out.print(arr[9]);
    }
}
