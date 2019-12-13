package 结构型模式.装饰者;

public class Soy extends Decorate {
    public Soy(Drink obj) {
        super(obj);
        setDes("豆浆");
        setPrice(1.5f);
    }
}
