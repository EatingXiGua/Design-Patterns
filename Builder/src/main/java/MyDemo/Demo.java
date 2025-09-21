package MyDemo;

//自己写的一个简单的建造者模式 链式调用
public class Demo {
    public static void main(String[] args) {
        A a = new A();
        a.buildv1(1).buildv2(2).buildv3(3);
        System.out.println(a.v1);
        System.out.println(a.v2);
        System.out.println(a.v3);
    }
}

class A{
    int v1;
    int v2;
    int v3;

    //链式调用：通过在每个方法中返回 this（即当前对象），实现了方法的链式调用
    //逐步构建：可以一步一步地设置对象的各个属性
    //最终返回完整对象：通过一系列的方法调用，最终构建出一个完整配置的对象
    public A buildv1(int i) {
        v1 = i;
        return this;
    }

    public A buildv2(int i) {
        v2 = i;
        return this;
    }

    public A buildv3(int i) {
        v3 = i;
        return this;
    }
}