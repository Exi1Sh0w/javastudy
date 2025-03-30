package 方法;

/*
    @Auther: exiashow
    @Date: 2025/3/16 22:19
    @Summary: 带有参数的方法
 */
public class MethodDemo3 {
    public static void getIntSum(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }


    // 练习1。定义一个方法，求长方形的周长，并打印结果
    public static void getLength(int chang, int kuan){
        int result = (chang + kuan) * 2;
        System.out.println(result);
    }
}
