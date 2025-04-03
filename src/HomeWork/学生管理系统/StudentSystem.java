package HomeWork.学生管理系统;

import java.util.ArrayList;
import java.util.Scanner;

/*
    @Auther: exiashow
    @Date: 2025/3/31 22:09
    @Summary: 
*/
public class StudentSystem {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        loop:
        while (true) {
            System.out.println("-------------欢迎来到天人组织-------------");
            System.out.println("1: 添加人员");
            System.out.println("2: 删除人员");
            System.out.println("3: 修改人员");
            System.out.println("4: 查询人员");
            System.out.println("5: 退出");

            System.out.print("请输入您的选择: ");


            Scanner sc = new Scanner(System.in);
            String choice = sc.next();

            switch (choice) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> getStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    // 类似于goto， loop是可以随便取的名字啦.
                    break loop;
                    // 也可以使用下面这种方式，直接退出java虚拟机
                    //System.exit(0);
                }
                default -> System.out.println("没有这个选项哦...");
            }
        }
    }

    // 添加人员
    private static void addStudent(ArrayList<Student> list) {
        //System.out.println("添加人员");
        // 要求， ID唯一
        Student s = new Student();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入人员ID");
            String id = sc.next();
            boolean flag = contains(list, id);
            if (flag) {
                // 表示ID已经存在
                System.out.println("id存在，请重新输入");
            } else {
                s.setId(id);
                break;
            }
        }

        System.out.println("请输入人员名字");
        String name = sc.next();
        s.setName(name);

        System.out.println("请输入人员年龄");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("请输入人员地址");
        String address = sc.next();
        s.setAddress(address);


        list.add(s);
    }

    // 删除人员
    private static void deleteStudent(ArrayList<Student> list) {
        // System.out.println("删除人员");
        Scanner sc = new Scanner(System.in);
        System.out.println("删除人员的ID");
        String id = sc.next();
        // 查询id再集合中的索引
        int index = getIndex(list, id);
        if (index >= 0 ) {
            list.remove(index);
            System.out.println("id为" + id + "的人员信息已经删除");
        }else{
            System.out.println("id不存在，删除失败");
        }

    }

    // 修改人员
    private static void updateStudent(ArrayList<Student> list) {
        // System.out.println("修改人员");
        Scanner sc = new Scanner(System.in);
        System.out.println("修改人员的信息");
        String id = sc.next();

        int index = getIndex(list, id);
        if (index == -1) {
            System.out.println("要修改的id" + id + "不存在，请重新输入");
            return;
        }
        Student s = list.get(index);

        System.out.println("请输入人员的新名字");
        String newName = sc.next();
        s.setName(newName);

        System.out.println("请输入人员的新年龄");
        int newAge = sc.nextInt();
        s.setAge(newAge);

        System.out.println("请输入人员的新地址");
        String newAddress = sc.next();
        s.setAddress(newAddress);



    }

    // 查询人员
    private static void getStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("里面没人啊..开始招人吧..");
        }
        // System.out.println("查询人员");
        System.out.println("id\t\t姓名\t年龄\t家庭地址");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId() + "\t" + list.get(i).getName() + "\t" + list.get(i).getAge() + "\t" + list.get(i).getAddress());
        }
    }

    private static boolean contains(ArrayList<Student> list, String id) {
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getId().equals(id)) {
//                return true;
//            }
//        }
//        return false;
        return getIndex(list, id) >= 0;
    }

    private static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
