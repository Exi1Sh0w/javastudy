package 面向对象进阶.继承.extendsDemo1;

/*
    @Auther: exiashow
    @Date: 2025/4/4 23:11
    @Summary: 
*/
public class Person {
    String name;
    int age;

    public Person() {
        System.out.println("这里是父类无参构造");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
