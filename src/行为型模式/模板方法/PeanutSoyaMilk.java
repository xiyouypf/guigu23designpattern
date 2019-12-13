package 行为型模式.模板方法;

public class PeanutSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        System.out.println("加入上好的花生");
    }
}
