package 面向对象进阶.抽象.Demo1;

/*
    @Auther: exiashow
    @Date: 2025/4/7 16:26
    @Summary: 
*/
public class Frog extends Animal{
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }

}
