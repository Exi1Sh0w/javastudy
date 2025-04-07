package 面向对象进阶.接口;

/*
    @Auther: exiashow
    @Date: 2025/4/7 22:57
    @Summary: 
*/
public class interfaceDemo1 implements interface_main {
    public interfaceDemo1() {
    }


    @Override
    public void method() {
        System.out.println("接口方法");
    }

    @Override
    public void show() {
        System.out.println("接口的默认方法");
    }
}
