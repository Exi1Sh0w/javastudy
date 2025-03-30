package HomeWork;

/*
    @Auther: exiashow
    @Date: 2025/3/14 13:12
    @Summary: 逢7过。当数字包含7或是7的倍数。求1-100之间有多少个这样的数字
 */
public class LoopDemo_1 {
    public static void main(String[] args) {
        //1.得到1-100之间的数字
        for (int i = 1; i <= 100; i++) {
            //System.out.println(i);
        //2.判断每一个数字，符合条件就打印过，不符合的就直接把数字打印出来
            if (i % 7 == 0 || i % 10 == 7 || i / 10 % 10 == 7){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
