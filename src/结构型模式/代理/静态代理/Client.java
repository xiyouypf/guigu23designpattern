package 结构型模式.代理.静态代理;

/**
 * 优点:在不修改目标对象的功能的前提下,能通过代理对象对目标功能扩展
 * 缺点:因为代理对象需要和目标对象实现一样的接口,所以会有很多的代理类
 * 一旦增加接口方法,目标对象和代理对象都要维护
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao=new TeacherDao();
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        teacherDaoProxy.teacher();
    }
}
