package 常用API;

import java.io.IOException;

/*
    @Auther: exiashow
    @Date: 2025/4/9 21:20
    @Summary: 一些常用的系统api,就已经定义好的方法---SystemRuntime
*/
public class SystemRuntimeDemo {
    public static void main(String[] args) throws IOException {
        // 获得cpu的线程数
        System.out.println(Runtime.getRuntime().availableProcessors());
        // jvm能从系统中获取总内存的大小，单位是byte字节
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);

        // 执行cmd命令，但不支持所有的cmd命令哈....
        Runtime.getRuntime().exec("shutdown -a");


        // 0是正常退出，非0是异常退出
        Runtime.getRuntime().exit(0);
        System.out.println("退出后还能看的到我吗? 答案是并不能");



    }
}
