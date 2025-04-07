package 面向对象进阶.多态.Demo2;

/*
    @Auther: exiashow
    @Date: 2025/4/6 23:57
    @Summary: 
*/
public class Cat extends Animal {
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "的猫咪眯着眼睛侧着头" + something);
    }

    public void catchMouse(){
        System.out.println("猫猫抓老鼠");
    }
}
