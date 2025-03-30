package Test;

/*
    @Auther: exiashow
    @Date: 2025/3/13 17:00
    @Summary: if语句的应用场景
 */

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
/*        // 用户在超市即使购买，商品总价为600元。键盘录入一个整数表示用户实际支付的钱。如果支付大于等于600，表示付款成功，否则付款失败
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入付款金额: ");
        int x = scanner.nextInt();

        if (x >= 600) {
            System.out.println("付款成功");
        } else {
            System.out.println("付款失败");
        }*/


        // 某影院出售100张票，标号1-100。奇数座位在左侧，偶数座位在右侧
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的票号");

        int ticket = scanner.nextInt();

        // 需要保证票据是真实，在范围的
        if (ticket > 0 && ticket < 100) {
            if (ticket % 2 == 1) {
                System.out.println("您的座位在左侧");
            } else {
                System.out.println("您的座位在右侧");
            }
        }else {
            System.out.println("兄弟，你的票是假的额");
        }
    }
}
