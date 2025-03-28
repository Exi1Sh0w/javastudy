package 字符串;

import java.util.Scanner;

/*
    @Auther: exiashow
    @Date: 2025/3/27 15:14
    @Summary: 模拟一个登录页面。知道正确的用户名密码，尝试登录。并有3次的登录机会
*/
public class StringDemo1 {
    public static void main(String[] args) {
        String rightUsername = "exiashow";
        String rightPassword = "123456";

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String s1 = scanner.next();
            System.out.println("请输入密码");
            String s2 = scanner.next();

            if (s1.equals(rightUsername) && s2.equals(rightPassword)) {
                System.out.println("登录成功");
                break;
            }else {
                if (i == 2) {
                    System.out.println("您的账号已经被锁定，请联系管理员。电话: 110");
                }else {
                    System.out.println("登录失败,用户名或密码不正确。 您还有" + (2-i) + "次机会");
                }
            }
        }
    }
}
