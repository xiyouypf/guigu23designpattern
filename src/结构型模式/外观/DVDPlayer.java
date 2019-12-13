package 结构型模式.外观;

public class DVDPlayer {
    //使用双重检测所单例模式
    private DVDPlayer(){}
    private static volatile DVDPlayer instance;
    public static DVDPlayer getInstance(){
        if (instance==null){
            synchronized (DVDPlayer.class){
                if (instance==null){
                    instance=new DVDPlayer();
                }
            }
        }
        return instance;
    }

    public void on(){
        System.out.println("dvd 打开");
    }
    public void off(){
        System.out.println("dvd 关闭");
    }
    public void play(){
        System.out.println("dvd 正在播放");
    }
    public void pause(){
        System.out.println("dvd 暂停..");
    }
}
