package HomeWork.对象数组练习;

/*
    @Auther: exiashow
    @Date: 2025/3/27 00:11
    @Summary: 
*/
public class GoodTest {
    public static void main(String[] args) {
        // 创建数组
        Goods[] arr1 = new Goods[3];

        // 创建三个商品对象
        Goods g1 = new Goods("001","iphone16",10000.0,4);
        Goods g2 = new Goods("002","iphone15",9000.0,5);
        Goods g3 = new Goods("003","iphone14",8000.0,10);

        // 把商品添加到数组中
        arr1[0] = g1;
        arr1[1] = g2;
        arr1[2] = g3;

        // 遍历
        for (int i = 0; i < arr1.length; i++) {
            Goods goods = arr1[i];
            System.out.println(goods.getName() + "," + goods.getPrice() + "," +  goods.getId() + "," + goods.getCount());
        }
    }
}
