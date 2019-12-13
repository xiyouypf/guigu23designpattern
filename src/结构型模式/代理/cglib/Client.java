package 结构型模式.代理.cglib;

public class Client {
    public static void main(String[] args) {
        TeacherDao target = new TeacherDao();
        TeacherDao instance = (TeacherDao) new ProxyFactory(target).getProxyInstance();
        instance.teach();
    }
}
