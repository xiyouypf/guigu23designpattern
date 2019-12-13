package 行为型模式.访问者;

/**
 * 优点:
 *  1.符合单一职责原则,让程序具有优秀的扩展性,灵活度非常高
 *  2.可以对功能进行统一,可以做报表,UI,拦截器,过滤器,适用于数据结构相对稳定的系统
 * 缺点:
 *  1.具体元素对访问者公布细节,也就是说访问者关注了其他类的内部细节,违反了迪米特法则,
 *      这样造成了具体元素变更变得比较困难
 *  2.违反了依赖倒转原则,访问者依赖了具体的元素,而不是抽象元素
 *  3.适合于 系统比较稳定的数据结构,又有经常变化的功能需求
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        Success success=new Success();
        objectStructure.display(success);

        System.out.println("---------------------------");

        Fail fail=new Fail();
        objectStructure.display(fail);

        System.out.println("---------------------------");

        Wait wait=new Wait();
        objectStructure.display(wait);
    }
}
