package top.yulin.io.file;

import java.io.*;

/**
 * 通过Reader和Writer操作字符流进行拷贝
 * 1.创建数据源
 * 2.创建流
 * 3.数据操作
 * 4.关闭流，释放资源
 */
public class FileCopyByReaderAndWriter {

    public static void main(String[] args) {
        copy("InputStreamTest.txt","OutputStreamTest.txt");
    }
    public static void copy(String pathInput,String pathOutput){

        //1.创建数据源
        File fileInput = new File(pathInput);//从此地址读取文件
        File fileOutput = new File(pathOutput);//从此将数据写入
        //2.创建Reader，Writer流
        Reader reader = null;
        Writer writer = null;//此处定义方便在finally块中调用关闭流
        //3.数据操作，读取数据，写入数据
        try {
            reader = new FileReader(fileInput);
            writer = new FileWriter(fileOutput);
            int len = -1;//长度变量，读取数据时记录长度，避免超长读取过多
            char[] flush = new char[1024];//数据中转字符数组   读取数据：字符串-->字符数组  写入数据：字符数组-->字符串
            while ((len = reader.read(flush))!=-1){//遍历读取数据
                writer.write(flush);//写入数据
                writer.flush();//刷新Writer流
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //4.关闭流，释放资源,原则:先入后防
            if (null!=writer){//在writer流不为空前提下关闭
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null!=reader){//在reader流不为空前提下关闭
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
