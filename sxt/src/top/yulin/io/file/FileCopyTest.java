package top.yulin.io.file;

import java.io.*;

/**
 * 文件拷贝
 * 将输入与输出结合起来
 * 注意：释放资源原则，先创建的后关闭
 */
public class FileCopyTest {

    public static void main(String[] args) {
        copy("1.JPG","Copy_1.JPG");
    }

    //将FileCopy封装
    public static void copy(String inputPath, String outputPath){
        //1.创建源
        File fileInput = new File(inputPath);//待拷贝的文件
        File fileOutput = new File(outputPath);//拷贝后写入的文件
        //2.创建读取和写入流
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(fileInput);
            os = new FileOutputStream(fileOutput);
            //3. 数据操作
            int len = -1;
            byte[] flush = new byte[1024];//字节数组中转读取的数据
            while ((len = is.read(flush))!=-1){// 3.1数据读取,循环读取
                os.write(flush);//3.2 数据写入
                os.flush();//write要刷新流
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {//4.关闭流，释放资源，先打开的后关闭
            if (null != os){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }if (null != is){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

