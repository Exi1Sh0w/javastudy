package 面向对象进阶.多态.Demo2;

/*
    @Auther: exiashow
    @Date: 2025/4/6 23:39
    @Summary: 
*/
public class Animal {
    private int age;
    private String color;

    public Animal() {
    }

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat(String something ) {
        System.out.println("小动物在吃什么" + something);
    }
}
