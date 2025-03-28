package 字符串;

/*
    @Auther: exiashow
    @Date: 2025/3/27 21:23
    @Summary: 手机号码脱敏
*/
public class StringDemo4 {
    public static void main(String[] args) {
        String phonenumber = new String("13585988601");
        String start = phonenumber.substring(0, 4);
        String end = phonenumber.substring(7, 11);

        System.out.println(start + "***" + end);
    }
}
