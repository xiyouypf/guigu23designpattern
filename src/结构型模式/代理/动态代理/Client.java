package 结构型模式.代理.动态代理;


public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao=new TeacherDao();
        ITeacherDao instance = (ITeacherDao) new ProxyFactory(teacherDao).getProxyInstance();
        instance.teach();
        instance.sayHello("java");
    }
}
