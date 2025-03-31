package 集合;

import java.util.ArrayList;

/*
    @Auther: exiashow
    @Date: 2025/3/30 23:29
    @Summary: 定义一个集合，添加字符串，并进行遍历。遍历格式参照：[元素1， 元素2， 元素3]
*/
public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hello");
        arr.add("World");
        arr.add("hahaha");

        System.out.print("[");
        for (int i = 0; i < arr.size(); i++) {
            if (i == arr.size() - 1) {
                System.out.print(arr.get(i));
            }else {
                System.out.print(arr.get(i) + ",");
            }
        }
        System.out.println("]");
    }
}
