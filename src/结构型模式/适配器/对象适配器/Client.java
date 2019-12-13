package 结构型模式.适配器.对象适配器;
//合成复用原则
public class Client {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
