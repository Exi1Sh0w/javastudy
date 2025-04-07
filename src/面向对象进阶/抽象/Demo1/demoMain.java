package 面向对象进阶.抽象.Demo1;

/*
    @Auther: exiashow
    @Date: 2025/4/7 16:37
    @Summary: 
*/
public class demoMain {
    public static void main(String[] args) {
        Animal f1 = new Frog();
        f1.drink();
        f1.eat();

        Animal d1 = new Dog();
        d1.eat();
        d1.drink();

    }
}
