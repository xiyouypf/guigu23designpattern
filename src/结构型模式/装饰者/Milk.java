package 结构型模式.装饰者;

public class Milk extends Decorate {
    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrice(2.0f);
    }
}
