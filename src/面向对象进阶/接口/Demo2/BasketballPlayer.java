package 面向对象进阶.接口.Demo2;

/*
    @Auther: exiashow
    @Date: 2025/4/7 22:14
    @Summary: 
*/
public class BasketballPlayer extends Sports{
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学习打篮球");
    }


}
