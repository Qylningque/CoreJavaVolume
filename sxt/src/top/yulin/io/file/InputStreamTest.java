package top.yulin.io.file;

import java.io.*;

/**
 * io操作基本步骤
 *  1.创建源
 *  2.创建流
 *  3.数据操作
 *  4.关闭流，释放资源
 */
public class InputStreamTest {
    public static void main(String[] args) {
        //1.创建数据源
        File file = new File("InputStreamTest.txt");
        //2.创建流
        InputStream is = null;
        //3.数据操作，读
        try {
            is = new FileInputStream(file);
            int temp;
            //循环读数据
            while (((temp = is.read())!=-1)){
                System.out.print((char)temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //4.关闭流，释放资源
            try {
                if(null != is){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
