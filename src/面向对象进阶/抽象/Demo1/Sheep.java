package 面向对象进阶.抽象.Demo1;

/*
    @Auther: exiashow
    @Date: 2025/4/7 16:29
    @Summary: 
*/
public class Sheep extends Animal {
    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("小山羊吃草");
    }
}
