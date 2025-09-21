package MyDemo;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

// 用Lombok库实现建造者模式
public class Demo3 {
    public static void main(String[] args) {
        A3 a = A3.builder().v1(1).v2(2).build();
        System.out.println(a.getV1());
        System.out.println(a.getV2());
        System.out.println(a.getV3());
    }
}

@Data
@Builder
class A3{
    private int v1;
    private int v2;
    private int v3;
}