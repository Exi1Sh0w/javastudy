package HomeWork.对象数组练习;

/*
    @Auther: exiashow
    @Date: 2025/3/27 00:06
    @Summary: 定义数组存储3个商品对象。
    商品的属性: 商品的id，名字，价格，库存
    创建3个商品对象，并把商品对象存入到数组当中
*/
public class Goods {
    private String id;
    private String name;
    private double price;
    private int count;

    public Goods(String id, String name, double price, int count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public Goods(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
