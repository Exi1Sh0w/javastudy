package 集合;

import java.util.ArrayList;

/*
    @Auther: exiashow
    @Date: 2025/3/30 23:35
    @Summary: 定义一个集合，添加一些学生对象，并进行遍历
    学生类的属性为: 姓名，年龄
*/
public class ArrayListDemo2 {
    public static void main(String[] args) {
        // 1.创建集合
        ArrayList<Student> list = new ArrayList<>();

        // 2.创建学生对象
        Student s1 = new Student("张三", 20);
        Student s2 = new Student("李四", 15);
        Student s3 = new Student("王五", 55);

        // 3.添加金集合
        list.add(s1);
        list.add(s2);
        list.add(s3);

        // 使用for循环读出学生的姓名和年龄
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + " " + list.get(i).getAge());
        }
    }
}
