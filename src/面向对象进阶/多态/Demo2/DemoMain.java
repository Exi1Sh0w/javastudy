package 面向对象进阶.多态.Demo2;

/*
    @Auther: exiashow
    @Date: 2025/4/7 00:09
    @Summary: 
*/
public class DemoMain {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.setAge(7);
        a.setColor("黑");
        a.eat("骨头");

        Animal b = new Dog();
        b.setAge(8);
        b.setColor("粉");
        b.eat("馒头");

        Dog c = (Dog) b;
        c.eat("烧饼");
        c.lookHome();


        Animal d = new Cat();
        d.setAge(9);
        d.setColor("白");
        d.eat("小鱼干");


        Person p1 = new Person();
        p1.setAge(30);
        p1.setName("老王");
        p1.keeppet(a, "花生");


        Person p2 = new Person();
        p2.setAge(25);
        p2.setName("老李");
        p2.keeppet(d, "辣条");

    }
}
