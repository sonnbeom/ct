package codingtest;

public class Silver5_4673 {
    public static void main(String[]args){
        boolean[] check = new boolean[10001];
        for(int i = 1; i < 10001; i++){
            int num = check(i);
            if(num < 10001){
                check[num] = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < 10001; i++){
            if(!check[i]){
                sb.append(i).append("\n");
            }
        }
        System.out.print(sb);
    }
    static int check(int i){
        int num = i;
        while(i != 0){
            num += i%10;
            i = i/10;
        }
        return num;
    }
}
