package 面向对象进阶.接口.Demo2;

/*
    @Auther: exiashow
    @Date: 2025/4/7 22:07
    @Summary: 
*/
public abstract class Sports extends Person {
    public Sports() {
    }

    public Sports(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}
