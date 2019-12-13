package 结构型模式.适配器.类适配器;

/**
 * 1)java是单继承机制,所以类适配器需要继承Voltage220V类这一点算是一个缺点,
 * 因为这要求Voltage5V必须是一个接口,有一定的局限性
 * 2)Voltage220V类的方法在Adapter中都会暴露出来,增加了使用成本
 * 3)由于其继承了Voltage220V类,所以可以根据需求重写Voltage220V中的方法,
 * 使得Adapter的灵活性增强了
 *
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("=========类适配器模式==========");
        Phone phone=new Phone();
        phone.charging(new VoltageAdapter());
    }
}
