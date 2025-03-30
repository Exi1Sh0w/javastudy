package 数组;

/*
    @Auther: exiashow
    @Date: 2025/3/14 13:32
    @Summary:
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        // 1.定义数组存储5个学生的年龄
        int[] age1 = new int[]{1, 2, 3, 4, 5};
        int[] age2 = {1, 2, 3, 4, 5};
        // 2.定义数组存储3个学生的姓名
        String[] names1 = new String[]{"张三", "李四", "王五"};
        String[] names2 = {"张三", "李四", "王五"};
        // 3.定义数组存储4个学生的身高
        double[] height1 = new double[]{1.75, 1.77, 1.60, 1.83};
        double[] height2 = {1.75, 1.77, 1.60, 1.83};


        // 打印结果: [I@34a245ab, 打印出来的是在内存里的地址
        // 扩展知识： [表示是数组; I表示是INT,整数类型; @是隔离符号; 34a245ab是真实的内存地址
        System.out.println(age1);


        System.out.println(age1[4]);

    }
}
