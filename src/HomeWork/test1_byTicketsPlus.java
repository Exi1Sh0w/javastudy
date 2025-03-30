package HomeWork;

/*
    @Auther: exiashow
    @Date: 2025/3/17 23:39
    @Summary: 使用方法优化购买机票的代码
 */

import java.util.Scanner;

public class test1_byTicketsPlus {
    // 1.我要干嘛?  根据仓位和折扣来计算最终的票价
    // 2.我干这件事，需要什么才能完成?  需要原价/仓位/以及月份
    // 3.方法的调用是否需要继续使用这个结果 需要，表示方法必须有返回值

    public static void main(String[] args) {
        // 1.键盘录入: 机票原价/月份/头等舱或经济舱
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入机票的原价: ");
        int ticket = scanner.nextInt();

        System.out.println("请输入当前的月份: ");
        int month = scanner.nextInt();

        System.out.println("请输入购买的仓位: 0头等舱 1经济舱: ");
        int seat = scanner.nextInt();


        if (month >= 5 && month <= 10) {
            ticket = getPirce(ticket, seat, 0.9, 0.8);
        }
        else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            ticket = getPirce(ticket, seat, 0.7, 0.65);
        }else {
            System.out.println("你家有" + month + "个月啊???");
        }
        System.out.println(ticket);
    }

    public static int getPirce(int ticket, int seat, double v0, double v1){
        if (seat == 0){
            ticket = (int) (ticket * v0);
        }else if (seat == 1){
            ticket = (int) (ticket * v1);
        }else {
            System.out.println("建议座货舱");
        }
        return ticket;
    }
}


