package 结构型模式.适配器.接口适配器;

/**
 * 1)当不需要全部实现接口提供的方法的时候,可以先设计一个抽象类实现接口,
 * 并为给接口的每个方法提供一个默认实现(空方法),那么该方法的子类就可以
 * 有选择的覆盖父类的某些方法来实现需求
 * 2)适用于一个接口不想使用其所有方法的情况
 */
public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter=new AbsAdapter(){
            @Override
            public void m1() {
                System.out.println("使用了m1的方法");
            }
        };
        absAdapter.m1();
    }
}
