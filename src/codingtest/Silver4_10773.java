package codingtest;

import java.util.Scanner;
import java.util.Stack;

public class Silver4_10773 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            int input = sc.nextInt();
            if(input != 0){
                stack.push(input);
            }
            else{
                stack.pop();
            }
        }
        int sum = 0;
        for(int v : stack){
            sum += v;
        }
        System.out.print(sum);
    }
}
