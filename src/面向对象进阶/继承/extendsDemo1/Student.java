package 面向对象进阶.继承.extendsDemo1;

/*
    @Auther: exiashow
    @Date: 2025/4/4 23:13
    @Summary: 
*/
public class Student extends Person {
    public Student(){
        // 子类构造方法中隐藏的super()去访问父类的无参构造。
        // super()必须是在第一行的哈..
        super();
        System.out.println("这边是子类无参构造");
    }

    // 有参构造
    public Student(String name, int age) {
        super(name, age);
    }
}
