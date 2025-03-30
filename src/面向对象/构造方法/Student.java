package 面向对象.构造方法;

/*
    @Auther: exiashow
    @Date: 2025/3/25 20:51
    @Summary: 
*/
public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // this 表示的是调用者所在的地址值
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 无参构造
    public Student() {
        System.out.println("你好呀，我是空参构造方法");
    }

    // 有参构造
    public Student(String name, int age) {
        // System.out.println(name + "大帅哥。你有" + age + "岁了吗");
        this.name = name;
        this.age = age;
    }
}
