package Test;

/*
    @Auther: exiashow
    @Date: 2025/3/13 20:20
    @Summary: Switch语句的应用场景
 */
public class SwitchDemo {
    public static void main(String[] args) {
/*        // 1.定义变量记录我心里想吃的面
        String noodles = "新疆拌面";
        // 2.拿着这个面利用switch和四种面匹配
        switch (noodles) {
            case "兰州拉面":
                System.out.println("可以吃兰州拉面啦");
                break;
            case "武汉热干面":
                System.out.println("可以吃武汉热干面啦");
                break;
            case "北京炸酱面":
                System.out.println("可以吃北京炸酱面啦");
                break;
            case "新疆拌面":
                System.out.println("可以吃新疆拌面啦");
                break;
            default:
                System.out.println("只能吃方便面了");
                break;
        }*/


        // 将1，2，3 替换为一，二，三。利用switch新特性，只有java12和以上版本才支持
        // 这种写法不需要写break,就可以防止break穿透啦
        int num1 = 2;

        switch (num1) {
            case 1 -> System.out.println("一");
            case 2 -> System.out.println("二");
            case 3 -> System.out.println("三");
            default -> System.out.println("没有额");
        }

    }
}
