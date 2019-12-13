package 结构型模式.外观;

//projector  n. [仪] 投影仪; 放映机; 探照灯; 设计者;
public class Projector {
    private Projector(){}
    private static volatile Projector instance;
    public static Projector getInstance(){
        if (instance==null){
            synchronized (Projector.class){
                if (instance==null){
                    instance=new Projector();
                }
            }
        }
        return instance;
    }

    public void on(){
        System.out.println("Projector投影仪打开");
    }
    public void off(){
        System.out.println("Projector投影仪关闭");
    }
    public void focus(){
        System.out.println("Projector投影仪正在聚焦");
    }
}
