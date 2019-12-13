package 结构型模式.外观;
//stereo n. 立体声; 立体声系统; 铅版; 立体照片; adj. 立体的; 立体声的; 立体感觉的
public class Stereo {
    private Stereo(){}
    private static Stereo instance;
    static {
        instance=new Stereo();
    }
    public static Stereo getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Stereo立体声打开");
    }
    public void off(){
        System.out.println("Stereo立体声关闭");
    }
    public void up(){
        System.out.println("Stereo立体声声音调大");
    }
    public void down(){
        System.out.println("Stereo立体声声音调小");
    }
}
