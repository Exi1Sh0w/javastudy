package 字符串.StringJoiner;

import java.util.StringJoiner;

/*
    @Auther: exiashow
    @Date: 2025/3/28 20:46
    @Summary: 
*/
public class Stringjoiner_main {
    public static void main(String[] args) {
//        StringJoiner joiner = new StringJoiner(",");
//        joiner.add("a");
//        joiner.add("b");
//        joiner.add("c").add("d");
//        System.out.println(joiner);

        StringJoiner joiner = new StringJoiner("--", "exia", "show");
        joiner.add("aaa").add("bbb").add("ccc");
        System.out.println(joiner);
    }
}
