package codingtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Silver3_2503 {
    static List<BaseBallData> dataList = new ArrayList<>();
    static int n;
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int data = sc.nextInt();
            int strike = sc.nextInt();
            int ball = sc.nextInt();
            BaseBallData baseBallData = new BaseBallData(data, strike, ball);
            dataList.add(baseBallData);
        }
        int result = calculate();
        System.out.println(result);

    }
    static int calculate(){
        int result = 0;
        for (int i = 123; i < 987; i++) {
            int testPass = 0;
            for (int j = 0; j < n; j++) {
                int strikeCount = 0;
                int ballCount = 0;
                BaseBallData current = dataList.get(j);
                String currentData = Integer.toString(current.data);
                String comparingData = Integer.toString(i);

                for (int k = 0; k < 3; k++) {
                    if (currentData.charAt(k) == comparingData.charAt(k)){
                        strikeCount++;
                    }
                }

                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (currentData.charAt(k) == comparingData.charAt(l)){
                            if(k != l){
                                ballCount++;
                            }
                        }
                    }
                }
                if (current.strike == strikeCount && current.ball == ballCount){
                    testPass++;
                }
            }
            if (testPass == n){
                result++;
            }
        }
        return result;
    }
    static class BaseBallData{
        int data;
        int strike;
        int ball;
        public BaseBallData(int data, int strike, int ball){
            this.data = data;
            this.strike = strike;
            this.ball = ball;
        }
    }
}
