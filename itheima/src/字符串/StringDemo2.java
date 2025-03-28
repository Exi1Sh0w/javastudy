package 字符串;

import java.util.Scanner;

/*
    @Auther: exiashow
    @Date: 2025/3/27 16:18
    @Summary: 键盘录入一串字符串。统计该字符串有多少个大小写以及数字
*/
public class StringDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一串字符串吧");
        String name = scanner.nextLine();

        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                bigCount++;
            }else if (c >= 'a' && c <= 'z') {
                smallCount++;
                // 这边底层都会转换为ascii编码，所以如果直接用不加引号的0-9会报错哦。因为ascii编码的第0位并不是0..
            }else if (c >= '0' && c <= '9') {
                numCount++;
            }
        }
        System.out.println("大写字母有：" + bigCount + "个");
        System.out.println("小写字母有：" + smallCount + "个");
        System.out.println("数字有：" + numCount + "个");
    }
}
