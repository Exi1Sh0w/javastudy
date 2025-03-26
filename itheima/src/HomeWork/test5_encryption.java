package HomeWork;

import java.util.Scanner;

/*
    @Auther: exiashow
    @Date: 2025/3/19 22:41
    @Summary: 数字加密和解密。
    某系统的数字密码(大于0)。比如1983，采用加密方式进行传输
    原则如下:
        每位数加上5
        再对10求余
        最后将所有的数字反转
        得到一串新数
 */
public class test5_encryption {
    public static void main(String[] args) {
        // 分析:
        // 1.将整数里面的每一位放到数组当中
        int[] arr = new int[]{1, 9, 8, 3};
        // 2.加密
        // 一个循环就干一件事！所以在第二部分用3个循环
        // 2.1每位数加上5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
            // System.out.println(arr[i]);
        }
        // 2.2对10求余
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
        // 2.3将所有的数字反转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

/*        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/

        // 3.将数组里面的每一个数字进行拼接，变成加密之后的结果
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num * 10 + arr[i];
            //System.out.println(num);
        }
        System.out.println(num);
    }
}
