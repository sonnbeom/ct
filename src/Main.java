import java.util.*;
public class Main {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int[] storage = new int[10];
        for(int i = 0; i < n.length(); i++){
            String s = n.substring(i,i+1);
            int t = Integer.parseInt(s);
            if(t == 9){
                t = 6;
            }
            storage[t]++;
        }
        storage[6] = storage[6]/2 + storage[6]%2;
        Arrays.sort(storage);
        System.out.print(storage[9]);
    }
}
