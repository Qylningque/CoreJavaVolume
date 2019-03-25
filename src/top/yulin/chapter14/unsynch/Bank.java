package top.yulin.chapter14.unsynch;

import java.util.Arrays;

/**
 * 14-6
 * 同步存取测试
 */
public class Bank {

    private final double[] accounts;//定义账户数组

    /**
     * 构造函数.传入账户数量，每个账户初始化金额
     * @param n
     * @param initialBalance
     */
    public Bank(int n,double initialBalance) {
        this.accounts = new double[n];
        Arrays.fill(accounts,initialBalance);
    }

    /**
     * 交易方法，传入交易双方账户和交易金额
     * @param fromAccount
     * @param toAccount
     * @param amount
     */
    public void transfer(int fromAccount,int toAccount,double amount){
        if (accounts[fromAccount] < amount){//当转出账户金额小于交易金额时，关闭交易
            return;
        }
        accounts[fromAccount] -= amount;//转出账户减少金额，等于交易金额
        accounts[toAccount] += amount;//转入账户增加金额，等于交易金额
        System.out.printf(Thread.currentThread()+":"+"从"+fromAccount+"-->"+toAccount+"="+amount+"----------------");
        System.out.println("当前银行总金额："+getTotalBalance());
    }

    /**
     * 获得当前银行总金额
     * @return
     */
    public double getTotalBalance(){
        double sum = 0.00;
        for(double a:accounts){
            sum += a;
        }
        return sum;
    }
    /**
     * 获得账户总数
     * @return
     */
    public int size(){
        return accounts.length;
    }
}
