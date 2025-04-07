package 面向对象进阶.继承.Test;

/*
    @Auther: exiashow
    @Date: 2025/4/4 23:49
    @Summary: 
*/
public class testMain {
    public static void main(String[] args) {
        Chef c1 = new Chef();
        c1.work();

        Manager m1 = new Manager();
        m1.work();

        Manager m2 = new Manager("1", "exiashow", 150000, 150000);
        System.out.println(m2.getId() + " " + m2.getName() + " " + m2.getSalary());
        m2.eat();
        m2.work();
    }
}
