package top.yulin.chapter14.unsynch;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 14-6
 * 非同步存取测试
 */
public class SynchronizedBank {

    private final double[] accounts;//定义账户数组
    private Lock banLock = new ReentrantLock();//定义一个锁对象
    /**
     * 构造函数.传入账户数量，每个账户初始化金额
     * @param n
     * @param initialBalance
     */
    public SynchronizedBank(int n, double initialBalance) {
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

        banLock.lock();
        try {
            accounts[fromAccount] -= amount;//转出账户减少金额，等于交易金额
            accounts[toAccount] += amount;//转入账户增加金额，等于交易金额
            System.out.printf(Thread.currentThread()+":"+"从"+fromAccount+"-->"+toAccount+"="+amount+"----------------");
            System.out.println("当前银行总金额："+getTotalBalance());
        }
        finally {
            banLock.unlock();
        }
    }

    /**
     * 获得当前银行总金额
     * @return
     */
    public double getTotalBalance(){
        double sum = 0;
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
