package HomeWork;

import java.util.Scanner;

/*
    @Auther: exiashow
    @Date: 2025/3/17 22:49
    @Summary:
 */
public class test1_byTickets {
    public static void main(String[] args) {
        // 机票严格按照淡季旺季/头等舱和经济舱收费。输入机票原价/月份/头等舱或经济舱
        // 按照如下规则计算机票价格: 旺季(5-10月)头等舱9折，经济舱8折。淡季(11-4月)，头等舱7折，经济舱6.5折


        // 1.键盘录入: 机票原价/月份/头等舱或经济舱
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入机票的原价: ");
        int ticket = scanner.nextInt();

        System.out.println("请输入当前的月份: ");
        int month = scanner.nextInt();

        System.out.println("请输入购买的仓位: 0头等舱 1经济舱: ");
        int seat = scanner.nextInt();

        // 2.判断月份是淡季还是旺季

        if (month >= 5 && month <= 10) {
            // 3.判断当前机票是经济舱还是头等舱
            if (seat == 0) {
                System.out.println("你的机票钱是: " + ticket * 0.9);
            } else if (seat == 1) {
                System.out.println("你的机票钱是: " + ticket * 0.8);
            } else {
                System.out.println("建议座货舱");
            }

        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            if (seat == 0) {
                System.out.println("你的机票钱是: " + ticket * 0.7);
            } else if (seat == 1) {
                System.out.println("你的机票钱是: " + ticket * 6.5);
            } else {
                System.out.println("建议座货舱");
            }
        } else {
            System.out.println("兄弟，你家有" + month + "个月啊????");
        }
    }
}
