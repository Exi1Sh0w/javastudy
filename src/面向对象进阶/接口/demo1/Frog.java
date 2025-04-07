package 面向对象进阶.接口.demo1;

/*
    @Auther: exiashow
    @Date: 2025/4/7 20:29
    @Summary: 
*/
public class Frog extends Animal implements swim {
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }


    @Override
    public void swim() {
        System.out.println("蛙泳");
    }
}
