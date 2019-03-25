package top.yulin.chapter14.synch2;

/**
 * 14-7
 * 竞争条件，锁对象，条件对象测试
 */
public class SynchBankTest {

    public static final int TOTAL_ACCOUNTS = 100;//总账户数
    public static final double INITIAL_BALANCE = 1000;//账户初始化金额
    public static final double MAX_AMOUNT = 1000;//最大交易金额
    public static final int DEALY = 10;//延迟时间

    public static void main(String[] args) {
        //创建Bank类实例化对象
        Bank bank = new Bank(TOTAL_ACCOUNTS,INITIAL_BALANCE);
        //循环bank对象调用transfer方法
        for (int i = 0;i<TOTAL_ACCOUNTS;i++){
            int fromAccount = i;//转出账户
            Runnable runnable = ()->{
              while (true){
                  int toAccount = (int) (bank.size()*Math.random());//转出账户
                  double amount = MAX_AMOUNT*Math.random();//交易金额
                  try {
                      bank.transfer(fromAccount,toAccount,amount);
                      Thread.sleep((int) (DEALY*Math.random()));
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
            };
            Thread thread = new Thread(runnable);
            thread.start();
        }

    }

}
