package 字符串;

/*
    @Auther: exiashow
    @Date: 2025/3/27 14:53
    @Summary: 
*/
public class String_main {
    public static void main(String[] args) {
//        ==等于是比较内存地址是否一样?
//        直接赋值的字符串是在串池里的，如果内容一样会直接引用
//        new出来的就是不同内存的啦

        String name1 = "hello";
        String name2 = "hello";

        String name3 = new String("abc");
        String name4 = new String("abc");

        System.out.println(name1 == name2);
        System.out.println(name3 == name4);

        System.out.println(name1.equals(name2));
        String name5 = "Hello";
        // 忽略大小写，适用于验证码等场景
        System.out.println(name1.equalsIgnoreCase(name5));
    }
}
