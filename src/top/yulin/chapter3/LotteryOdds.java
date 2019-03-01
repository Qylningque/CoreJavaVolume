package top.yulin.chapter3;

import java.util.Scanner;

/**
 * 抽奖概率计算
 */
public class LotteryOdds {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("需要选中多少个数字?");
        int k = scanner.nextInt();
        System.out.println("从1开始，最大取到多少？");
        int n = scanner.nextInt();
        //计算公式：n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
        int lotteryOdds = 1 ;//设置初始概率为1
        //进行for循环判断中计算
        for (int i = 1 ; i <= k ; i++){
            lotteryOdds = lotteryOdds * (n - i + 1) / i ;
            System.out.println("你中奖的概率为1/"+lotteryOdds+"，祝你好运！");
        }



    }
}
