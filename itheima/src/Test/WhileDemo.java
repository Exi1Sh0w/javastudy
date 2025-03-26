package Test;

/*
    @Auther: exiashow
    @Date: 2025/3/14 00:39
    @Summary: While语句的应用场景
 */
public class WhileDemo {
    public static void main(String[] args) {
/*        // 打印1-100的数字
        int i = 1;
        while (i <= 100){
            System.out.println(i);
            i++;
        }*/


 /*       // 珠穆朗玛峰高度为(8844.43米=8844430毫米)。假设我有一张纸，厚度为0.1毫米。需要折叠几次，才能和珠峰一样高呢?
        // 折叠纸张，每一次都是原来的2倍。第一次0.2毫米，第二次0.4，第三次0.8......

        // 1.定义一个变量来记录山峰的高度
        double height = 8844430;
        // 2.定义一个变量来记录纸张的厚度
        double paper = 0.1;
        // 3.记录打印的次数
        int count = 0;
        // 4.循环折叠纸张，只要小于山峰的高度就继续循环
        while (paper < height) {
            paper = paper * 2;
            count++;
        }
        System.out.println("只需要折" + count + "次就能超过珠峰啦~~~");*/


        // 检查数字是不是回文数。什么是回文数:正着读和反着读是一样的，比如121，1221等。12345就不是吧
        // 1.定义一个数字
        int x = 1213;
        // 2.保存x原始的值，用于最后的比较。因为x在后续的循环中值已经发生改变
        int tmp = x;
        // 3.记录倒过来的值
        int num = 0;

        while ( x != 0){
            int ge = x % 10;
            x = x / 10;
            num = num * 10 + ge;
        }
        System.out.println(num);
        System.out.println(num == tmp);
    }
}
