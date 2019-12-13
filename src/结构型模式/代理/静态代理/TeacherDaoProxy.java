package 结构型模式.代理.静态代理;

public class TeacherDaoProxy implements ITeacherDao {
    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teacher() {
        System.out.println("开始代理,完成某些操作");
        target.teacher();
        System.out.println("提交...");
    }
}
