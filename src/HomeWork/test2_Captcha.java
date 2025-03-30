package HomeWork;

import java.util.Random;

/*
    @Auther: exiashow
    @Date: 2025/3/18 22:43
    @Summary:
 */
public class test2_Captcha {
    // 定义方法实现随机产生一个5位的验证码。
    // 验证码格式: 长度为5，前四位是大写字母或小写字母，最后一位是数字
    public static void main(String[] args) {

        // 分析:
        // 1.大写字母和小写字母都放在数组中
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            // ASCII码表
            if (i <= 25) {
                // 添加小写字母 0-25 -> a-z
                chs[i] = (char) (97 + i);
            } else {
                // 添加大写字母
                // A ---65
                // 上面的i是0-25,到这边就是26了，如果这边不减26，那就无法对应大写的A啦
                chs[i] = (char) (65 + i - 26);
            }
        }

        /*for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i] + " ");
        }*/

        String result = "";
        // 2.随机抽取4次
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = random.nextInt(chs.length);
            // 利用随机索引获取对应的元素
            //System.out.println(chs[randomIndex]);
            result += chs[randomIndex];
        }
        // System.out.println(result);

        // 3.随机抽取一个数字0-9
        int number = random.nextInt(10);
        // 将4个字母的结果与随机数字拼接
        result = result + number;

        System.out.println(result);

    }
}
