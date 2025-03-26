package Test;

import java.util.Scanner;

/*
    @Auther: exiashow
    @Date: 2025/3/13 16:19
    @Summary: 使用三元运算符获取两个整数的较大值
 */
public class test2 {
    public static void main(String[] args) {
/*        int x = 30;
        int y = 20;

        int result = x > y ? x : y;
        System.out.println(result);
        // System.out.println(x > y ? x : y);*/


/*        // 计算两只老虎的体重是否一直
        Scanner scanner = new Scanner(System.in);
        System.out.println("第一只老虎的体重");
        int tiger1 = scanner.nextInt();
        System.out.println("第二只老虎的体重");
        int tiger2 = scanner.nextInt();

        String result = tiger1 == tiger2 ? "相同" : "不同";
        System.out.println(result);*/

        // 计算三个和尚哪个和尚的最高.
        // 1.定义三个变量记录三个和尚的身高
        Scanner heshang = new Scanner(System.in);
        System.out.println("输入第一个和尚的身高");
        int hs1 = heshang.nextInt();
        System.out.println("输入第二个和尚的身高");
        int hs2 = heshang.nextInt();
        System.out.println("输入第三个和尚的升高");
        int hs3 = heshang.nextInt();
        // 2.第一个和尚和第二个和尚比较
        int result1 = hs1 > hs2 ? hs1 : hs2;
        // 3.拿2的比较结果和第三个和尚比较
        int result2 = result1 > hs3 ? result1 : hs3;

        System.out.println(result2);

    }
}
