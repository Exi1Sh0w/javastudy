package 面向对象进阶.内部类;

/*
    @Auther: exiashow
    @Date: 2025/4/7 23:36
    @Summary: 
*/
public class Car {
    // 例子
    String carName;
    int carAge;
    String carColor;

    public void show() {
        System.out.println("我的车车是: " + this.carName + ", 颜色是: " + this.carColor);
        Engine e = new Engine();
        e.engineName="牛逼1号";
        System.out.println("引擎使用的是: " + e.engineName);
    }


    class Engine{
        String engineName; //发动机品牌
        int engineAge; //使用年限

        public void show(){
            System.out.println(engineName);
            System.out.println(carName);
        }
    }
}
