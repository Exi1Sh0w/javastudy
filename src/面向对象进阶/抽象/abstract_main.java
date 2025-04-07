package 面向对象进阶.抽象;

/*
    @Auther: exiashow
    @Date: 2025/4/7 14:35
    @Summary:

    抽象类和抽象方法的格式:
        public abstract 返回值类型 方法名(参数列表)
        public abstract class 类名{}


    抽象类和抽象方法注意事项
        1.抽象类不能实例化，即不能创建对象
        2.抽象类中不一定有抽象方法，有抽象方法的类一定是抽象类
        3.可以有构造方法
        4.抽象类的子类
            要么重写抽象类中所有的抽象方法  推荐！！
            要么是抽象类



   抽象类的好处:
   当开发大型项目时，肯定不是一个人去开发的额。每个开发者的习惯也不一样，比如是否带返回值啥的。这时候可以利用抽象类毕竟重写的特性来统一
*/


// 抽象类
public abstract class abstract_main {
    // 抽象方法
    public abstract void work();

    public void sleep(){
        System.out.println("睡觉了");
    }
}
