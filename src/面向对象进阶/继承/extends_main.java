package 面向对象进阶.继承;

/*
    @Auther: exiashow
    @Date: 2025/4/3 17:26
    @Summary: 当类与类之间，存在相同的内容，并满足子类是父类中的一种，就可以考虑使用继承来优化代码
*/
public class extends_main {
    public static void main(String[] args) {
        DemoDog dog = new DemoDog();
        dog.eat();
        dog.drink();

        DemoHusky h1 = new DemoHusky();
        h1.eat();
        h1.lookHome();
        h1.chai();


        DemoCat c1 = new DemoCat();
        c1.fuckMouse();

        DemoBuoumao b1 = new DemoBuoumao();
        b1.drink();
        b1.fuckMouse();
    }
}
