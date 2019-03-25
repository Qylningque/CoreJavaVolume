package top.yulin.chapter14.synch;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 14-7
 * 竞争条件，锁对象，条件对象测试
 */
public class Bank {

    private final double[] accounts;//定义账户数组
    private Lock bankLock;//锁对象
    private Condition sufficientFunds;//条件对象

    /**
     * 构造函数.传入账户数量，每个账户初始化金额
     * @param n
     * @param initialBalance
     */
    public Bank(int n,double initialBalance) {
        this.accounts = new double[n];
        Arrays.fill(accounts,initialBalance);
        bankLock = new ReentrantLock();//可以用来保护临界区的可重入锁
        sufficientFunds = bankLock.newCondition();//返回一个与锁相关的条件对象
    }

    /**
     * 交易方法，传入交易双方账户和交易金额
     * @param fromAccount
     * @param toAccount
     * @param amount
     */
    public void transfer(int fromAccount,int toAccount,double amount){

        bankLock.lock();
        try {
            while(accounts[fromAccount] < amount){//当转出账户金额小于交易金额时，当前线程进入阻塞状态
                sufficientFunds.await();//将当前线程放到条件的等待集中
            }
            accounts[fromAccount] -= amount;//转出账户减少金额，等于交易金额
            accounts[toAccount] += amount;//转入账户增加金额，等于交易金额
            System.out.printf(Thread.currentThread()+":"+"从"+fromAccount+"-->"+toAccount+"="+amount+"----------------");
            System.out.println("当前银行总金额："+getTotalBalance());
            sufficientFunds.signalAll();//当前交易成功执行时，接触在该条件下等待集中线程的阻塞状态
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            bankLock.unlock();
        }
    }

    /**
     * 获得当前银行总金额
     * @return
     */
    public double getTotalBalance(){
        bankLock.lock();
        try {
            double sum = 0.00;
            for(double a:accounts){
                sum += a;
            }
            return sum;
        }
        finally {
            bankLock.unlock();
        }
    }
    /**
     * 获得账户总数
     * @return
     */
    public int size(){
        return accounts.length;
    }
}
