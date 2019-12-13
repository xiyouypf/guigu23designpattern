package 结构型模式.装饰者;

public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
