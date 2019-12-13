package 结构型模式.装饰者;

//具体的Decorator,这里就是调味品
public class Chocolate extends Decorate {
    public Chocolate(Drink obj) {
        super(obj);
        setDes(" 巧克力 ");
        setPrice(3.0f);//调味品的价格
    }
}
