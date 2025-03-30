package HomeWork.对象数组练习;

/*
    @Auther: exiashow
    @Date: 2025/3/27 00:25
    @Summary: 定义数组存储3辆汽车。
    汽车熟悉那个: 品牌，价格，颜色
    创建三个汽车对象，数据通过键盘录入而来，并将数据存入到数组当中

    数据通过键盘录入而来是这道题目的难点
*/
public class Car {
    private String brand;
    private int price;
    private String color;

    public Car() {
    }

    public Car(String name, int price, String color) {
        this.brand = name;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
