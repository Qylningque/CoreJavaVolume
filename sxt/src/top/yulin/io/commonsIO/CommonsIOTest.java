package src.top.yulin.io.commonsIO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.SuffixFileFilter;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.List;

/**
 * 测试CommonsIO
 */
public class CommonsIOTest {

    public static void main(String[] args) {
        //文件大小
        Long fileSize = FileUtils.sizeOf(new File("InputStreamTest.txt"));
        System.out.println("文件大小："+fileSize);
        //目录大小
        long deSize = FileUtils.sizeOfDirectory(new File("E:/IntellijIDEAWorkspaces/CoreJavaVolume"));
        System.out.println("目录大小："+deSize);
        System.out.println("---------------------------------------分割线-----------------------------------------");
        /**
         * 列出子孙级
         * 参数1 file对象
         * 参数2 过滤条件  如不为空EmptyFileFilter.NOT_EMPTY   如后缀  new SuffixFileFilter("java")  且and 或or
         * 参数3 子孙级目录 DirectoryFileFilter.INSTANCE  ，仅下级目录null
         */
        System.out.println("---------------------------------------分割线-----------------------------------------");
        Collection<File> files = FileUtils.listFiles(new File("E:/IntellijIDEAWorkspaces/CoreJavaVolume"),
                FileFilterUtils.and(new SuffixFileFilter("java"), EmptyFileFilter.NOT_EMPTY),
                DirectoryFileFilter.INSTANCE);
        for(File file : files){
            System.out.println(file.getAbsolutePath());
        }
        /**
         * 读取内容
         */
        System.out.println("---------------------------------------分割线-----------------------------------------");
        try {
            String msg = FileUtils.readFileToString(new File("InputStreamTest.txt"));
            System.out.println(msg);
            //读到字节数组中
            byte[] bytes = FileUtils.readFileToByteArray(new File("InputStreamTest.txt"));
            System.out.println(bytes.length);
            //逐行读取
            List<String> list = FileUtils.readLines(new File("InputStreamTest.txt"),"UTF-8");
            for(String string : list){
                System.out.println(string);
            }
            //迭代器Iterator逐行读取
            LineIterator it = FileUtils.lineIterator(new File("InputStreamTest.txt"));
            while (it.hasNext()){
                System.out.println(it.next());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        /**
         * 写出内容
         */
        try {
            FileUtils.write(new File("OutputStreamTest.txt"),"测试写出\r\n","UTF-8",false);
            FileUtils.writeStringToFile(new File("OutputStreamTest.txt"),"测试写出2","UTF-8",true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        /**
         * 拷贝
         */
        try {
            //复制文件
            FileUtils.copyFile(new File("1.JPG"),new File("Copy_2.JPG"));
            //复制文件到目录
            FileUtils.copyFileToDirectory(new File("1.JPG"),new File("E:/IntellijIDEAWorkspaces/CoreJavaVolume"));
            //复制目录到目录(后面参数作为前面参数的子目录)
            FileUtils.copyDirectoryToDirectory(new File("E:/IntellijIDEAWorkspaces"),new File("E:/IntellijIDEAWorkspaces/CoreJavaVolume"));
            //复制目录(只复制目录及目录中的内容)
            FileUtils.copyDirectory(new File("E:/IntellijIDEAWorkspaces"),new File("E:/IntellijIDEAWorkspaces/CoreJavaVolume"));
            //拷贝URL内容
            String url = "http://www.baidu.com";
            FileUtils.copyURLToFile(new URL(url),new File("marvel.JPG"));
            //拷贝URL源代码
            String dataUrl = IOUtils.toString(new URL(url),"UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
