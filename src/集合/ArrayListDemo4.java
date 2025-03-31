package 集合;

import java.util.ArrayList;

/*
    @Auther: exiashow
    @Date: 2025/3/31 21:33
    @Summary: 定义一个javaBean类: phone
    Phone属性: 品牌，价格。
    main方法中定义一个集合，存入三个手机对象
    分别是: 小米，1000；苹果，8000；锤子，2999
    定义一个方法，将价格低于3000的时候信息返回
*/
public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();

        Phone p1 = new Phone("小米",1000);
        Phone p2 = new Phone("苹果",8000);
        Phone p3 = new Phone("锤子",2999);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        ArrayList<Phone> phoneInfoList = getPhoneInfo(list);
        for (int i = 0; i < phoneInfoList.size(); i++) {
            System.out.println(phoneInfoList.get(i).getBrand() + " " + phoneInfoList.get(i).getPrice());
        }

    }

    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list){
        // 当需要返回多个数据的时候，可以先把这些数据放在一个容器当中，再把容器返回
        ArrayList<Phone> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() < 3000) {
                // System.out.println(list.get(i).getBrand() + " " + list.get(i).getPrice());
                result.add(list.get(i));
            }
        }
        return result;
    }
}
