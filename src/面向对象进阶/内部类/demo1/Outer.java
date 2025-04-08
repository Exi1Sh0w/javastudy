package 面向对象进阶.内部类.demo1;

/*
    @Auther: exiashow
    @Date: 2025/4/8 12:44
    @Summary: 
*/
public class Outer {
    private int a = 10;

    public class Inner {
        private int a = 20;

        public void show() {
            int a = 30;
            System.out.println("这个是内部方法里的: " + a);
            System.out.println("这个是内部类里的: " + this.a);
            // Outer.this 获取了外部类对象的地址值
            System.out.println("这个是外部类里的: " + Outer.this.a);
        }
    }

/*    // 如果Inner是私有类，可以用下面这种方法来，等于是做个中转
    public Inner getInstace(){
        return new Inner();
    }*/
}

