package 结构型模式.组合模式;

public abstract class OrganizationComponent {
    private String name;
    private String des;

    //add方法
    protected void add(OrganizationComponent organizationComponent){
        //默认实现
        throw new UnsupportedOperationException();
    }
    //remove方法
    protected void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    //构造器
    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public String toString() {
        return "OrganizationComponent{" +
                "name='" + name + '\'' +
                ", des='" + des + '\'' +
                '}';
    }

    //方法print
    public abstract void print();
}
