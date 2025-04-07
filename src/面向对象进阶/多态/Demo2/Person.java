package 面向对象进阶.多态.Demo2;

/*
    @Auther: exiashow
    @Date: 2025/4/7 00:00
    @Summary: 
*/


public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

/*    public void keeppet(Dog dog, String something) {
        System.out.println("年龄为" + age + "的" + name + "养了一只" + dog.getColor() + "颜色的" + dog.getAge() + "岁的狗");
        dog.eat(something);
    }

    public void keeppet(Cat cat, String something) {
        System.out.println("年龄为" + age + "的" + name + "养了一只" + cat.getColor() + "颜色的" + cat.getAge() + "岁的猫");
        cat.eat(something);
    }*/

    public void keeppet(Animal a, String something) {
        // 判断对象a是否是Dog类，如果是则强转为Dog类
        if (a instanceof Dog d) {
            System.out.println("年龄为" + age + "的" + name + "养了一只" + a.getColor() + "颜色的" + a.getAge() + "岁的狗");
            d.eat(something);
            // 判断对象a是否是Dog类，如果是则强转为Cat类
        }else if(a instanceof Cat c){
            System.out.println("年龄为" + age + "的" + name + "养了一只" + c.getColor() + "颜色的" + c.getAge() + "岁的猫");
            c.eat(something);
        }else {
            System.out.println("对不起，没有这个类型的哦..");
        }
    }
}
