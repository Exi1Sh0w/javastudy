package 面向对象;

/*
    @Auther: exiashow
    @Date: 2025/3/24 20:20
    @Summary: 如何定义类。
    没有main方法的就叫javabean类，有的叫测试类
    一个代码文件中可以定义多个类，但是只能一个类是public修饰的。建议一个文件只写一个类
    public修饰的类名必须是java代码的文件名称
*/
public class classDemo1 {
    // 1.成员变量
    // 2.成员方法
    // 3.构造器
    // 4.代码块
    // 5.内部类

    String brand;
    double price;


    public void call() {
        System.out.println("手机在打电话");
    }

    public void playGame() {
        System.out.println("手机在玩游戏");
    }
}
