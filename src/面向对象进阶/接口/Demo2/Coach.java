package 面向对象进阶.接口.Demo2;

/*
    @Auther: exiashow
    @Date: 2025/4/7 22:10
    @Summary: 
*/
public abstract class Coach extends Person{
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}
