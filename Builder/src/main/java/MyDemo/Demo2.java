package MyDemo;

public class Demo2 {
    public static void main(String[] args) {
        A1 a1 = A1.builder().buildv1(1).build();
        System.out.println(a1.getV1());
    }
}

class A1{
    private int v1;
    private int v2;
    private int v3;

    //私有构造函数，只能通过Builder创建
    private A1(){}

    public int getV1() {
        return v1;
    }

    public int getV2() {
        return v2;
    }

    public int getV3() {
        return v3;
    }

    public static ABuilder builder(){
        return new ABuilder();
    }

    //ABuilder
    public static class ABuilder{
        private int v1;
        private int v2;
        private int v3;

        public ABuilder buildv1(int i) {
            this.v1 = i;
            return this;
        }

        public ABuilder buildv2(int i) {
            this.v2 = i;
            return this;
        }

        public ABuilder buildv3(int i) {
            this.v3 = i;
            return this;
        }

        public A1 build(){
            A1 a1 = new A1();
            a1.v1 = this.v1;
            a1.v2 = this.v2;
            a1.v3 = this.v3;
            return a1;
        }
    }
}