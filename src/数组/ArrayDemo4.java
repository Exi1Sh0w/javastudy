package 数组;

/*
    @Auther: exiashow
    @Date: 2025/3/14 15:31
    @Summary: 对于数组元素的操作
 */

import java.util.Random;

public class ArrayDemo4 {
    public static void main(String[] args) {
  /*      // 求数组里的最大值。 33，5，22，44，55
        int[] arrary = {33, 5, 22, 44, 55};

        // 不能写0, 因为数组中如果全部是复数的话，那就0最大了。暂时认为arrar[0]是最大的
        int max = arrary[0];
        for (int i = 1; i < arrary.length; i++) {
            // System.out.println(arrary[i]);
            if (arrary[i] > max) {
                max = arrary[i];
            }
        }
        System.out.println(max);*/


        // 自动生成10个1-100之间的随机数存入数组。1，求出所有数据的和；2.平均数；3.统计有多少个数比平均数小
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int randomNum = random.nextInt(100);
            array[i] = randomNum;
            System.out.print(array[i] + " ");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < sum / array.length) {
                //System.out.println(array[i]);
                count++;
            }
        }

        System.out.println("\n" + "总和是: " + sum);
        System.out.println("平均数是: " + sum / array.length);
        System.out.println("比平均数小的有" + count + "个");



    }
}
