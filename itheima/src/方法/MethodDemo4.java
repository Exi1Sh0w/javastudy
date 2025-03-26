package 方法;

/*
    @Auther: exiashow
    @Date: 2025/3/16 22:31
    @Summary: 带返回值的方法,所以原本void的地方就需要填写返回值的类型
 */
public class MethodDemo4 {
    // 格式：public static 返回值类型 方法名 (参数) {
    //          方法体
    //          return 返回值;
    //      }

    // 范例
    public static int getSum(int a, int b) {
        int c = a + b;
        return c;
    }


    // 小练习。总结一个季度的运营额
    public static int getPrice(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        return result;
    }


    // 小练习。比较两个长方形的面积
    public static double getArea(double chang, double kuan) {
        double area = (chang + kuan) * 2;
        return area;
    }
}
