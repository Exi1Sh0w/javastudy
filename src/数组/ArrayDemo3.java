package 数组;

/*
    @Auther: exiashow
    @Date: 2025/3/14 15:21
    @Summary: 数组的动态初始化
 */
public class ArrayDemo3 {
    public static void main(String[] args) {
        // 存放50个学生的姓名
        String[] students = new String[50];
        students[0] = "张三";
        students[1] = "李四";
        students[2] = "王五";


        System.out.println(students[1]);
    }
}
