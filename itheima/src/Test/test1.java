package Test;

/*
    @Auther: exiashow
    @Date: 2025/3/13 16:10
    @Summary: 在键盘输入两个整数。如果其中一个是6，最终结果输入True。如果他们的和为6的倍数，也输入True。其它情况都是false
 */

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1");
        int x = scanner.nextInt();
        System.out.println("Enter number2");
        int y = scanner.nextInt();

        boolean result = x == 6 || y == 6 || (x + y) % 6 == 0;

        System.out.println(result);

    }
}
