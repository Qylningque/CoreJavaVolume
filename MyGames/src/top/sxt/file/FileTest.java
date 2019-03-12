package top.sxt.file;

import java.io.File;
import java.io.IOException;

/**
 * File
 */
public class FileTest {

    public static void main(String[] args) {
        //读取文件
        File file = new File("d:/test/fileDocument");
        File file1 = new File(file,"FileTest.java");
        //获取文件信息
        if (file.isFile()) System.out.println("是文件");
        if(file.isDirectory()) System.out.println("是目录");
        //创建文件
        File file2 = new File(file,"FileTest2");
        try {
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //创建文件夹
        File file3 = new File("d:/test/makeNewDir");
        file3.mkdirs();//mkdir可以加s 不管存不存在都创建nanshoua 大da'dfdadadada
    }

}
