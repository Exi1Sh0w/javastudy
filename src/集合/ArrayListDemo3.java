package 集合;

import java.util.ArrayList;
import java.util.List;

/*
    @Auther: exiashow
    @Date: 2025/3/31 21:03
    @Summary: 定义一个集合，存入三个用户对象。用户属性为:id, username, password
    要求: 定义一个方法，根据id查找对应的用户信息
    如果存在，返回true
    如果不存在，返回false
*/
public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();

        Person p1 = new Person("1", "tom", "111111");
        Person p2 = new Person("2", "jerry", "222222");
        Person p3 = new Person("3", "tony", "333333");

        list.add(p1);
        list.add(p2);
        list.add(p3);

        System.out.println(getList(list, "3"));

    }

    public static boolean getList(ArrayList<Person> list, String id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
