package 字符串;

/*
    @Auther: exiashow
    @Date: 2025/3/27 16:34
    @Summary: 定义一个函数，接受字符串并反转。比如接收的是abc，输出的是cba
*/
public class StringDemo3 {
    public static void main(String[] args) {
        //reverser("abc");
        String result = reverser("abc");
        System.out.println(result);
    }

    public static String reverser(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            // System.out.println(ch);
            result += ch;
        }
        return result;
    }
}
