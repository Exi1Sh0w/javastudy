package HomeWork.对象数组练习;

import java.util.Scanner;

/*
    @Auther: exiashow
    @Date: 2025/3/27 00:27
    @Summary: 
*/
public class CarTest {
    public static void main(String[] args) {
        Car[] cars = new Car[3];

        // 创建汽车对象，数据来自于键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < cars.length; i++) {
            // 创建汽车的对象
            Car c = new Car();

            // 录入品牌
            System.out.println("请输入汽车品牌");
            String brand = sc.next();
            c.setBrand(brand);
            // 录入价格
            System.out.println("输入汽车的价格");
            int price = sc.nextInt();
            c.setPrice(price);
            // 录入颜色
            System.out.println("请输入汽车的颜色");
            String color = sc.next();
            c.setColor(color);

            // 把汽车对象添加到数组当中
            cars[i] = c;
        }
        // 遍历数组
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].getBrand());
        }
    }
}