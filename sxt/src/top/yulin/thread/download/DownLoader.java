package top.yulin.thread.download;

/**
 * 多线程下载图片
 */
public class DownLoader extends Thread{

    private String name;
    private String url;

    @Override
    public void run() {
        WebDownLoader webDownLoader = new WebDownLoader();
        webDownLoader.downLoad(url,name);
    }

    public DownLoader(String aUrl, String aName){
        this.url = aUrl;
        this.name = aName;
    }

    public static void main(String[] args) {
        String url1 = "https://gss2.bdstatic.com/-fo3dSag_xI4khGkpoWK1HF6hhy/baike/s%3D220/sign=06e3029e279759ee4e5067c982fa434e/342ac65c10385343f5ebe1b29213b07eca808878.jpg";
        String url2 = "https://gss3.bdstatic.com/-Po3dSag_xI4khGkpoWK1HF6hhy/baike/s%3D220/sign=401b109c62d9f2d3241123ed99ed8a53/d52a2834349b033b605ad3a715ce36d3d439bdf8.jpg";
        String url3 = "https://gss1.bdstatic.com/-vo3dSag_xI4khGkpoWK1HF6hhy/baike/s%3D220/sign=3a50f3f9242dd42a5b0906a9333a5b2f/b90e7bec54e736d1c2542a989a504fc2d46269df.jpg";
        //创建3个线程
        DownLoader downLoader1 = new DownLoader(url1,"1.jpg");
        DownLoader downLoader2 = new DownLoader(url2,"2.jpg");
        DownLoader downLoader3 = new DownLoader(url3,"3.jpg");
        //启动线程
        downLoader1.start();
        downLoader2.start();
        downLoader3.start();
    }
}
