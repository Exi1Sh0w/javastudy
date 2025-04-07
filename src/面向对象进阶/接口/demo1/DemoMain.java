package 面向对象进阶.接口.demo1;

/*
    @Auther: exiashow
    @Date: 2025/4/7 20:36
    @Summary: 
*/
public class DemoMain {
    public static void main(String[] args) {
        Frog f1 = new Frog("娃娃", 19);
        System.out.println("小青蛙叫:" + f1.getName() + ", 今年" + f1.getAge() + "岁啦");
        f1.eat();
        f1.swim();
    }
}
