package 面向对象进阶.多态;

/*
    @Auther: exiashow
    @Date: 2025/4/5 00:13
    @Summary:
*/
public class poly_main {
    /*
    * 什么是多态？ 对象的多种形态
    * 多态的前提？ 有继承/实现关系，有父类引用指向子类对象，有方法的重写
    * 多态的好处？ 使用父类型作为参数，可以接受所有子类对象，体现多态的扩展性与便利性
    *
    *
    *
    *
    * 调用成员变量的特点: 编译看左边，运行也看左边
    * 调用成员方法的特点: 编译看左边，运行看右边(1.检查左右的方法是否存在；2.重写方法等于是把父类继承下来的方法重写了哈)
    * */

    public static void main(String[] args) {
        // 方法中，使用父类作为参数，可以接受所有子类对象
        Animal a = new Dog();
        a.eat();

        Animal b = new Cat();
        b.eat();




        // a.sleep(); 多态无法调用子类特有的方法
        // 可以使用强制转换来达到要求，但是不能转成换Cat类哦..
        Dog d = (Dog) a;
        d.sleep();

    }
}

class Animal{
    public void eat(){
        System.out.println("动物吃东西");
    }
}

class Dog extends Animal{

    @Override
    public void eat(){
        System.out.println("狗狗吃骨头");
    }

    public void sleep(){
        System.out.println("狗狗睡觉了");
    }
}

class Cat extends Animal{

    @Override
    public void eat(){
        System.out.println("猫猫吃鱼干");
    }

    public void catchMouse(){
        System.out.println("猫猫抓老鼠");
    }
}