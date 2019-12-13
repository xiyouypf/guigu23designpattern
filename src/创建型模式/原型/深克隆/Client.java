package 创建型模式.原型.深克隆;

public class Client {
    public static void main(String[] args) {
        DeepProtoType d=new DeepProtoType();
        d.name="宋江";
        d.deepCloneableTarget=new DeepCloneableTarget("大牛","小牛");

        //深拷贝:方式1 使用clone方法
//        DeepProtoType d1= (DeepProtoType) d.clone();
//        DeepProtoType d2= (DeepProtoType) d.clone();
//        System.out.println(d1);
//        System.out.println(d2);
//        System.out.println(d1==d2);
//
//        System.out.println(d1.deepCloneableTarget.hashCode());
//        System.out.println(d2.deepCloneableTarget.hashCode());

        //深拷贝:方式2 通过对象的序列化实现深拷贝
        DeepProtoType d1= (DeepProtoType) d.deepClone();
        DeepProtoType d2= (DeepProtoType) d.deepClone();
        System.out.println(d1);
        System.out.println(d2);

        System.out.println(d1==d2);

        System.out.println(d1.deepCloneableTarget.hashCode());
        System.out.println(d2.deepCloneableTarget.hashCode());

    }
}
