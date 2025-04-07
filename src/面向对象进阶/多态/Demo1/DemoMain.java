package 面向对象进阶.多态.Demo1;

/*
    @Auther: exiashow
    @Date: 2025/4/5 00:17
    @Summary: 
*/
public class DemoMain {
    public static void main(String[] args) {
//        Person p1 = new Teacher();
//        p1.setName("exiashow");
//        p1.setAge(18);
//        p1.show();
//
//        Person p2 = new Student();
//        p2.setName("jerry");
//        p2.setAge(21);
//        p2.show();
//
//        Person p3 = new Administrator();
//        p3.setName("tom");
//        p3.setAge(55);
//        p3.show();

        Student s = new Student();
        s.setName("小明");
        s.setAge(11);

        Teacher t = new Teacher();
        t.setName("姗姗");
        t.setAge(22);

        Administrator admin = new Administrator();
        admin.setName("admin");
        admin.setAge(33);


        reg(s);
        reg(t);
        reg(admin);


    }

    public static void reg(Person p ){
        p.show();
    }
}
