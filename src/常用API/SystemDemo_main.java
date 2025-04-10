package 常用API;

/*
    @Auther: exiashow
    @Date: 2025/4/9 13:52
    @Summary: 一些常用的系统api,就已经定义好的方法--System类
    System.arraycopy
    System.currentTimeMillis

    注意点：
        1.如果数据源数组和目标数组都是基本数据类型，那两者的类型必须要保持一致！
        2.长度也需要一样
        3.如果两者都是引用数据类型，那么子类型可以赋值给父类类型
*/
public class SystemDemo_main {
    public static void main(String[] args) {

  /*      // 数组拷贝
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = new int[10];
        //参数解释: 1,数据源; 2.从数据源的第几个索引开始; 3.目标源; 4.目标源索引地址; 5.拷贝的个数
        // result: 0 0 0 0 1 2 3 0 0 0
        System.arraycopy(arr1, 0, arr2, 4, 3);

        // result: 0 0 7 8 9 0 0 0 0 0
        // System.arraycopy(arr1, 6, arr2, 2, 3);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");*/


        Student s1 = new Student("zhangsan", 19);
        Student s2 = new Student("lisi", 23);
        Student s3 = new Student("wangwu", 16);

        // 验证注意点中的第3点
        // 测试将arr1里面的数据拷贝到arr2中。其实拷贝的就是数据的地址值
        Student[] arr1 = {s1, s2, s3};
        // Student[] arr2 = new Student[3];
        Person[] p1 = new Student[3];
        System.arraycopy(arr1, 0, p1, 0, arr1.length);

        for (int i = 0; i < p1.length; i++) {
            System.out.println(p1[i].getName() + " " + p1[i].getAge());
        }

        // 打印当前的unix时间戳
        System.out.println(System.currentTimeMillis());


    }
}

class Person {
    private String name;
    private int age;

    public Person() {

    }

    ;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student extends Person {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }
}
