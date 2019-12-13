package 创建型模式.原型.深克隆;

import java.io.*;

public class DeepProtoType implements Serializable,Cloneable {
    public String name;
    public DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType() {
    }

    //深拷贝--方式1 使用clone方法
    @Override
    protected Object clone(){
        DeepProtoType deepProtoType=null;
        try{
            deepProtoType= (DeepProtoType) super.clone();
            deepProtoType.deepCloneableTarget= (DeepCloneableTarget) deepCloneableTarget.clone();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return deepProtoType;
    }

    //深拷贝:方式2 通过对象的序列化实现深拷贝(推荐)
    public Object deepClone(){
        //创建流对象
        ByteArrayOutputStream bos=null;
        ByteArrayInputStream bis=null;
        ObjectOutputStream oos=null;
        ObjectInputStream ois=null;
        try{
            //序列化
            bos=new ByteArrayOutputStream();
            oos=new ObjectOutputStream(bos);
            oos.writeObject(this);//当前这个对象以对象流的方式输出

            //反序列化
            bis=new ByteArrayInputStream(bos.toByteArray());
            ois=new ObjectInputStream(bis);
            DeepProtoType copyObj= (DeepProtoType) ois.readObject();
            return copyObj;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            //关闭流
            try{
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (Exception e2){
                System.out.println(e2.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        return "DeepProtoType{" +
                "name='" + name + '\'' +
                ", deepCloneableTarget=" + deepCloneableTarget +
                '}';
    }
}
