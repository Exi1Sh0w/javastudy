package 面向对象进阶.多态.Demo1;

/*
    @Auther: exiashow
    @Date: 2025/4/5 00:15
    @Summary: 
*/
public class Teacher extends Person{

    @Override
    public void show() {
        System.out.println("老师的信息为: " + getName() + " " + getAge());
    }
}
