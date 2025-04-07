package 面向对象进阶.抽象.Demo1;

/*
    @Auther: exiashow
    @Date: 2025/4/7 16:28
    @Summary: 
*/
public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗狗吃骨头");
    }
}
