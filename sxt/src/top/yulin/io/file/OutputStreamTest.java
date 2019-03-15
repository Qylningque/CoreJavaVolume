package top.yulin.io.file;

import java.io.*;

/**
 * OutputStream操作
 * 1.创建数据源
 * 2.创建流
 * 3.数据操作
 * 4.关闭流，释放资源
 */
public class OutputStreamTest {
    public static void main(String[] args) {
        //1 创建数据源
        File fileOutputStream = new File("OutputStreamTest.txt");
        //2 创建流
        OutputStream os = null;//下一步在try中赋初始值，这样finlly中就可以获取
        try {
            os = new FileOutputStream(fileOutputStream,true);//append: true 从已有数据后写入，false 从前写入，覆盖已有数据
            String msg = "Nice to meet you ! \r\n";//定义输出数据
            byte[] datas = msg.getBytes();//字符串到字节，编码
            //3.数据操作，输出
            os.write(datas,0,datas.length);
            os.flush();//write操作前注意要刷新流
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null != os){//os流不为null前提下关闭流释放资源
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
