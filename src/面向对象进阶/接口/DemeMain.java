package 面向对象进阶.接口;

/*
    @Auther: exiashow
    @Date: 2025/4/7 22:59
    @Summary: 
*/
public class DemeMain {
    public static void main(String[] args) {
        interfaceDemo1 m = new interfaceDemo1();
        m.show();
        m.method();

        // 直接调用就完事了,不需要重写/也没办法重写哦
        interface_main.fuck();
    }
}
