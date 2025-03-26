package 方法;

/*
    @Auther: exiashow
    @Date: 2025/3/16 23:38
    @Summary: 很多小练习
 */
public class MethodDemo5 {
    // 打印结果必须是: [1, 2, 3, 4, 5]
    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("]");


    }

    // 设计一个方法求数组的最大值，并将最大值返回
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }


    // 定义一个方法判断数组中的某一个数组是否存在，并将结果返回给调用处
    public static boolean check(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    // 定义一个方法copyOfRange(int[] arr, int from, int to)
    // 将数组arr中索引from(包含)开始到索引to(不包含)的元素复制到新数组中，并返回
    public static int[] copyOfRange(int[] arr, int from, int to) {
        //1. 使用动态初始化,确定新数组的长度
        int[] newArr = new int[to - from];

        // 伪造索引
        int index = 0;
        // 将原始数组arr中的from到to的上对应的元素，复制到newArr中
        for (int i = from; i < to; i++) {
            //复制格式: 数组名[索引] = 数据值
            newArr[index] = arr[i];
            index++;
        }

        return newArr;
    }
}
