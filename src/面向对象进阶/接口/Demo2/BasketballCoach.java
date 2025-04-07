package 面向对象进阶.接口.Demo2;

/*
    @Auther: exiashow
    @Date: 2025/4/7 22:16
    @Summary: 
*/
public class BasketballCoach extends Coach {
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教打篮球");
    }
}
