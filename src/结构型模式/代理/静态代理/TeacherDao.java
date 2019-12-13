package 结构型模式.代理.静态代理;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teacher() {
        System.out.println("老师授课中");
    }
}
