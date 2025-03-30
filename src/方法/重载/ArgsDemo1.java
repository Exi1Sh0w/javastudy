package 方法.重载;

/*
    @Auther: exiashow
    @Date: 2025/3/16 23:10
    @Summary: 使用方法重载的思想，设计比较两个整数是否相同的方法。要求兼容全整数类型(byte, short, int, long)
 */
public class ArgsDemo1 {
    public static String getEquals(int num1, int num2) {

        return num1 == num2 ? "相等" : "不相等";
    }

    public static String getEquals(long num1, long num2) {

        return num1 == num2 ? "相等" : "不相等";
    }

}
