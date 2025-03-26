package 方法;

/*
    @Auther: exiashow
    @Date: 2025/3/16 00:49
    @Summary:// 最简单的格式
 */
public class Method_main {
    // 1.什么是方法？ 方法是程序中最小的执行单元
    // 2.实际开发中，什么时候用到方法?  重复的代码/具有独立功能的代码可以抽取到方法
    // 3.实际开发中，有什么好处？ 可以提供代码的复用性以及可维护性
    public static void main(String[] args) {
        MethodDemo1.hello();
        MethodDemo2.getSum();

        MethodDemo3.getIntSum(10, 100);

        MethodDemo3.getLength(10, 20);

        System.out.println(MethodDemo4.getSum(66, 55));

        System.out.println("这个季度的运营额是: " + MethodDemo4.getPrice(66, 77, 88));
        // 多次调用同一种方法
        int sum1 = MethodDemo4.getPrice(66, 77, 88);
        int sum2 = MethodDemo4.getPrice(11, 22, 33);
        int sum3 = MethodDemo4.getPrice(44, 55, 66);
        int sum4 = MethodDemo4.getPrice(10, 20, 30);
        int finalSum = sum1 + sum2 + sum3 + sum4;
        System.out.println("全年的运营额是: " + finalSum);


        double chang1 = MethodDemo4.getArea(5, 8);
        double chang2 = MethodDemo4.getArea(6.6, 4);
        if (chang1 > chang2) {
            System.out.println("第一个长方形比较大");
        } else {
            System.out.println("第二个长方形比较大");
        }


        int[] array = {1, 2, 3, 4, 5};
        MethodDemo5.printArr(array);

        int[] array2 = {11, 22, 77, 44, 55};
        System.out.println(MethodDemo5.getMax(array2));

        int[] array3 = {123, 456, 112, 110, 56};
        System.out.println(MethodDemo5.check(array3, 111));


        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] copyArr = MethodDemo5.copyOfRange(array4, 2, 9);
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }
    }

}
