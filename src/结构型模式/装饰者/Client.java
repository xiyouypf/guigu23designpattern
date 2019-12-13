package 结构型模式.装饰者;

public class Client {
    public static void main(String[] args) {
        //装饰者模式下订单,2份巧克力+1份牛奶的LongBlack

        //1.点一份LongBlack
        Drink order=new LongBlack();
        System.out.println(order.cost());
        System.out.println(order.getDes());
        //2.order加入一份牛奶
        order = new Milk(order);
        System.out.println(order.cost());
        System.out.println(order.getDes());
        //3.order加入一份巧克力
        order = new Chocolate(order);
        System.out.println(order.cost());
        System.out.println(order.getDes());
        //4.order再加入一份巧克力
        order = new Chocolate(order);
        System.out.println(order.cost());
        System.out.println(order.getDes());
    }
}
