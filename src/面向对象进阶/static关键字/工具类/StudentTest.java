package 面向对象进阶.static关键字.工具类;

import java.util.ArrayList;

/*
    @Auther: exiashow
    @Date: 2025/4/1 23:42
    @Summary:  这个叫测试类...
*/
public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("tom", 12, "男");
        Student s2 = new Student("jerry", 21, "男");
        Student s3 = new Student("mary", 15, "女");
        Student s4 = new Student("shao", 55, "女");

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        int maxAge = studentUtil.getMaxAgeStudent(list);
        System.out.println(maxAge);
    }
}
