package 字符串.StringBuilder;

/*
    @Auther: exiashow
    @Date: 2025/3/28 20:08
    @Summary: 可以看成是一个容器，创建之后里面的内容是可变的
    作用: 提高字符串的操作效率
*/
public class StringBuider_main {
    public static void main(String[] args) {
/*        // 当使用之前的方法会非常的慢
        String s = "";
        for (int i = 1; i <= 1000000; i++) {
            s =  s + "abc";
        }
        System.out.println(s);*/


/*        // 无参--就是啥都没
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 1000000; i++) {
            sb.append("abc");
        }
        System.out.println(sb);*/

        // 有参--等于是在容器里有了个值
        StringBuilder sb1 = new StringBuilder("exiashow");
        for (int i = 1; i <= 2; i++) {
            sb1.append("abc");
        }
        System.out.println(sb1);
    }
}
