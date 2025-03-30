package HomeWork;

import java.sql.SQLOutput;

/*
    @Auther: exiashow
    @Date: 2025/3/19 00:18
    @Summary: 将一个数组中的元素复制到另一个新的数组中
 */
public class test3_arrayCopy {
    public static void main(String[] args) {
        // 分析:
        // 1.定义一个老数组并存储一些元素
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        // 2.定义一个新数组，长度和老数组一致
        int[] arr2 = new int[arr1.length];
        // 3.遍历老数组，得到老数组中的每一个元素，一次存入到新数组中

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
