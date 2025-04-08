package 面向对象进阶.内部类.demo1;

import java.util.Scanner;

/*
    @Auther: exiashow
    @Date: 2025/4/8 12:45
    @Summary: 
*/
public class testMain {
    public static void main(String[] args) {
        // 创建内部类的对象，并调用show方法
        Outer.Inner outer = new Outer().new Inner();
        outer.show();

//        Outer o1 = new Outer();
//        System.out.println(o1.getInstace());

/*        // 和本程序没毛线关系，只是因为需要使用内存分析工具。
        // 再使用内存分析工具的时候程序不能停止
        Scanner scanner = new Scanner(System.in);
        scanner.next(); */
    }

}
