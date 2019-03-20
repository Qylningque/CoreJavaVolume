package src.top.yulin.thread.download;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 下载图片
 */
public class WebDownLoader {

    //下载方法
    public void downLoad(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (MalformedURLException me){
            me.printStackTrace();
            System.out.println("路径不合法");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("下载失败");
        }
    }

}
