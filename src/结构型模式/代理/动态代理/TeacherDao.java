package 结构型模式.代理.动态代理;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello..."+name);
    }
}
