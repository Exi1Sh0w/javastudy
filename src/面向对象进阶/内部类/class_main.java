package 面向对象进阶.内部类;

/*
    @Auther: exiashow
    @Date: 2025/4/7 23:33
    @Summary: 内部类表示的事物是外部类的一部分，内部类单独出现没有任何意义。
    内部类的特点:
        内部类可以直接访问外部类的成员，包括私有。
        外部类要访问内部类的成员，必须创建对象
*/
public class class_main {
    public static void main(String[] args) {
        Car c = new Car();
        c.carName = "兰博基尼";
        c.carAge = 1;
        c.carColor = "粉色";


        c.show();
    }
}
