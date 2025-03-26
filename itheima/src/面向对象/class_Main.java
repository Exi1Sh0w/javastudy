package 面向对象;

/*
    @Auther: exiashow
    @Date: 2025/3/24 20:23
    @Summary:没有main方法的就叫javabean类，有的叫测试类
*/
public class class_Main {
    public static void main(String[] args) {
/*        // 创建手机类，与classDemo1配合使用

        classDemo1 phone = new classDemo1();
        phone.brand = "nokia";
        phone.price = 2000;

        // 获取手机对象中的值
        System.out.println(phone.brand);
        System.out.println(phone.price);

        phone.call();
        phone.playGame();


        classDemo1 phone2 = new classDemo1();
        phone2.brand = "xiaomi";
        phone2.price = 1000;
        System.out.println(phone2.brand);
        System.out.println(phone2.price);
        phone2.call();
        phone2.playGame();*/


        // 创建女朋友类，与classDemo2配合使用
        classDemo2 gf = new classDemo2();
        gf.gender = "女";
        gf.age = 18;
        gf.height = 1.78;
        gf.name = "哈哈";

        System.out.println(gf.name);
        System.out.println(gf.height);
        System.out.println(gf.age);
        System.out.println(gf.gender);

        gf.eat();
        gf.sleep();

        System.out.println("==============================");

        classDemo2 gf2 = new classDemo2();
        gf2.name = "嘻嘻";
        gf2.gender = "女";
        gf2.age = 19;
        gf2.height = 1.66;

        System.out.println(gf2.name);
        System.out.println(gf2.height);
        System.out.println(gf2.age);
        System.out.println(gf2.gender);

        gf2.eat();
        gf2.sleep();
    }
}
