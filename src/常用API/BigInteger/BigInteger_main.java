package 常用API.BigInteger;

import java.math.BigInteger;

/*
    @Auther: exiashow
    @Date: 2025/4/9 23:20
    @Summary: 
*/
public class BigInteger_main {
    public static void main(String[] args) {
        BigInteger b1 = BigInteger.valueOf(10);
        BigInteger b2 = BigInteger.valueOf(3);

        BigInteger b3 = b1.add(b2);
        System.out.println(b3);

        // 除法，获取商和余数。
        // 由于是获取有两个值，所以用数组来接受
        BigInteger[] arr = b1.divideAndRemainder(b2);
        System.out.println(arr.length);
        // 商
        System.out.println(arr[0]);
        // 余数
        System.out.println(arr[1]);

    }
}
