package 面向对象进阶.接口.demo1;

/*
    @Auther: exiashow
    @Date: 2025/4/7 20:30
    @Summary: 
*/
public class Rabbit extends Animal {
    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("小兔子吃胡萝卜");
    }
}
