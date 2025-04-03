package 面向对象进阶.static关键字;

/*
    @Auther: exiashow
    @Date: 2025/4/1 22:19
    @Summary: 
*/
public class StudentTest {
    public static void main(String[] args) {
        // 类似于默认值了?只要使用该方法的所有对象都会带上
        Student.teacherName = "exiashow";

        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(18);
        s1.setGender("M");

        s1.study();
        s1.show();

        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(21);
        s2.setGender("F");

        s2.study();
        s2.show();
    }
}
