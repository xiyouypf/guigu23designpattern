package 结构型模式.装饰者;

public class Decorate extends Drink {
    private Drink obj;

    public Decorate(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        //getPrice  自己的价格
        return super.getPrice()+obj.cost();
    }

    @Override
    public String getDes() {
        //return super.getDes();
        //obj.getDes()输出了被装饰着的信息
        return super.des+" "+super.getPrice()+"&&"+obj.getDes();
    }
}
