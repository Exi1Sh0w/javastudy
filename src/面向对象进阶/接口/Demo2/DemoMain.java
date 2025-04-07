package 面向对象进阶.接口.Demo2;

/*
    @Auther: exiashow
    @Date: 2025/4/7 22:16
    @Summary: 
*/
public class DemoMain {
    public static void main(String[] args) {
        TablePlayer t1 = new TablePlayer("马龙", 19);
        System.out.println(t1.getName() + " " + t1.getAge());
        t1.study();
        t1.speak();

        BasketballPlayer b1 = new BasketballPlayer("科比", 22);
        System.out.println(b1.getName() + " " + b1.getAge());
        b1.study();


    }
}
