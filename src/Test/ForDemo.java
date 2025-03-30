package Test;

/*
    @Auther: exiashow
    @Date: 2025/3/13 21:16
    @Summary: For语句的应用场景
 */

import java.util.Scanner;

public class ForDemo {
    public static void main(String[] args) {
   /*     // 打印5次hello,world

        for (int i = 0; i < 5; i++) {
            System.out.println("hello,world");
        }*/


/*        // 计算1-100的和
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("1-100的和是: " + sum);*/


/*         // 键盘记录两个数字，表示一个范围。统计这个范围内，既能被3整除，又能被5整除的数字有多少个
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字: ");
        int start = sc.nextInt();
        System.out.println("请输入第二个数字: ");
        int end = sc.nextInt();

        //统计变量
        int count = 0;

        for (int i = start; i <= end; i++) {
            // System.out.println(i);
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("既能被3整除又能被5整除，符合条件的有" + count + "个");*/



/*        // 对于上面的扩展
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字: ");
        int start = sc.nextInt();
        System.out.println("请输入第二个数字: ");
        int end = sc.nextInt();

        // 存储符合条件的数字的列表
        List<Integer> divisibleNumbers = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                divisibleNumbers.add(i); // 将符合条件的数字添加到列表中
            }
        }

        System.out.println("既能被3整除又能被5整除的数字有：");
        for (int number : divisibleNumbers) {
            System.out.print(number + " "); // 打印列表中的所有数字
        }
        System.out.println(); // 换行

        System.out.println("符合条件的数字共有" + divisibleNumbers.size() + "个");*/


        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                // 结束本次循环，继续下一次的循环
                continue;
            }
            System.out.println("小老虎正在吃第" + i + "个包子");
        }
    }
}
