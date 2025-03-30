package 数组;

/*
    @Auther: exiashow
    @Date: 2025/3/14 14:00
    @Summary: 数组的各种使用
 */


public class ArrayDemo2 {
    public static void main(String[] args) {

/*        // 遍历数组里所有的元素并打印
        int[] array = new int[]{1,2,3,4,5};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }*/


/*        // 遍历数组里所有的元素，并求数组里所有的和
        //1.定义一个数组
        int[] array = new int[]{1,2,3,4,5};
        //2.循环读出,并相加
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;
        }
        System.out.println(sum);*/


        // 遍历数组里所有的元素，并统计能被3整除的数字
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                count++;
                System.out.println("在这个数组中，能被3整除的是: " + array[i]);
            }
        }
        System.out.println("在这个数组中，能被3整除有: " + count + "个");
    }
}
