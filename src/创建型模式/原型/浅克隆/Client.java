package 创建型模式.原型.浅克隆;

/**
 * 浅克隆原型
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep=new Sheep("tom",1,"白色");
        Sheep sheep1= (Sheep) sheep.clone();
        Sheep sheep2= (Sheep) sheep.clone();
        Sheep sheep3= (Sheep) sheep.clone();
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep==sheep2);
    }
}
