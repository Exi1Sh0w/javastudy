package 面向对象进阶.多态.Demo1;

/*
    @Auther: exiashow
    @Date: 2025/4/5 00:16
    @Summary: 
*/
public class Administrator extends Person{
    public Administrator() {
    }

    public Administrator(String name, int age) {
        super(name, age);
    }



    @Override
    public void show() {
        System.out.println("管理员的信息为: " + getName() + " " + getAge());
    }
}
