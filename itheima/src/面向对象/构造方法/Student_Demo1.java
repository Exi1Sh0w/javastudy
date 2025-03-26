package 面向对象.构造方法;

/*
    @Auther: exiashow
    @Date: 2025/3/25 20:52
    @Summary: 
*/
public class Student_Demo1 {
    public static void main(String[] args) {
        //
        Student s1 = new Student();
        Student s2 = new Student("exiahsow", 66);

        s1.setName("苏苏");
        System.out.println(s1.getName());

        System.out.println(s2.getName());
        System.out.println(s2.getAge());


    }
}
