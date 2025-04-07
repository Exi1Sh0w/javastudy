package 面向对象进阶.接口;

/*
    @Auther: exiashow
    @Date: 2025/4/7 17:01
    @Summary:
    可以把接口理解为是一种规则

    接口是对行为的抽象，而继承是对属性的抽象

    接口的定义和使用:
        1.接口使用关键字interface来定义
            public interface 接口名{}
        2.接口不能实例化
        3.接口和类之间是实现关系，通过implements关键字表示
            public class 类名 implements 接口名{}
        4.接口的子类(实现类)
            要么重写接口中所有抽象方法  推荐！！！
            要么是抽象类

*/
public interface interface_main {

    public abstract void method();

    public default void show() {
        System.out.println("接口的默认方法---show");
    }

    public static void fuck(){
        System.out.println("静态接口");
    }
}

