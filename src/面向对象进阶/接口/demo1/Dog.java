package 面向对象进阶.接口.demo1;

/*
    @Auther: exiashow
    @Date: 2025/4/7 20:30
    @Summary: 
*/
public class Dog extends Animal implements swim{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗狗吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗刨");
    }
}
