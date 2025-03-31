package 集合;

import java.util.ArrayList;
import java.util.Scanner;

/*
    @Auther: exiashow
    @Date: 2025/3/30 23:59
    @Summary: 基于ArrayListDemo2修改，将固定学生的信息改为手动录入
*/
public class ArrayListDemo2_Plus {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s = new Student();

            System.out.println("请输入学生的名字");
            String name =scanner.next();
            System.out.println("请输入学生的年龄");
            int age = scanner.nextInt();


            s.setName(name);
            s.setAge(age);

            list.add(s);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + " " + list.get(i).getAge());
        }
    }
}
