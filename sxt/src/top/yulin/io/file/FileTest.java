package src.top.yulin.io.file;

import java.io.File;
import java.io.IOException;

/**
 * File类方法测试
 */
public class FileTest {

    public static void main(String[] args) {
        //定义File对象
        File file = new File("G:/3.jpg");
        System.out.println("名称:"+file.getName());//获得file名称
        System.out.println("路径："+file.getPath());//获得对象路径
        System.out.println("绝对路径："+file.getAbsolutePath());//获得绝对路径
        System.out.println("父路径："+file.getParent());//获得上级目录，有就有，没有就为null
        System.out.println("父对象："+file.getParentFile().getName());
        /**
         * 判断是否存在
         *  是否存在：exists()
         *  是否文件：isFile()
         *  是否文件夹:isDirectory()
         */
        System.out.println("是否存在："+file.exists());
        System.out.println("是否文件："+file.isFile());
        System.out.println("是否文件夹:"+file.isDirectory());
        /**
         * length()字节数  返回文件的字节数，文件的字节数为0 文件不存在为0
         */
        System.out.println("字节数："+file.length());
        /**
         * createNewFile()创建文件  不存在才创建
         * delete()删除文件   删除已存在的文件
         */
        File fileCreate = new File("G:/1.txt");
        try {
            boolean flag =  fileCreate.createNewFile();
            System.out.println("创建成功？"+flag);
        } catch (IOException e) {
            e.printStackTrace();
        }
        File fileDelete = new File("G:/1.txt");
        boolean flagDel = fileDelete.delete();
        System.out.println("删除成功？"+flagDel);
        /**
         * 创建目录 mkdir():必须确保上一级目录存在，上级目录不存在创建失败
         *          mkdirs():上级目录不存在一同创建
         */
        File fileMkdir = new File("G:/fileMkdir/1");
        boolean flagMkdir = fileMkdir.mkdir();
        System.out.println("mkdir："+flagMkdir);
        File fileMkdirs = new File("G:/fileMkdirs/1");
        boolean flagMkdirs = fileMkdir.mkdirs();
        System.out.println("mkdirs："+flagMkdirs);
        /**
         * 列出下一级目录
         *  list() 列出下级名称
         *  listFiles() 列出夏季File对象
         *  listRoots() 列出所有的盘符
         */
        File fileList = new File("G:/fileMkdirs");
        String[] listString = fileList.list();
        for(String element:listString){
            System.out.println("下级名称:"+element);
        }
        File fileListFiles = new File("G:/fileMkdirs");
        File[] listFiles = fileListFiles.listFiles();
        for(File element:listFiles){
            System.out.println(element.getAbsolutePath());
        }
    }

}
