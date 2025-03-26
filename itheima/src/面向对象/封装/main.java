package 面向对象.封装;

/*
    @Auther: exiashow
    @Date: 2025/3/25 00:53
    @Summary: 对象代表什么，就得封装对应的数据，并提供数据对应的行为
*/
public class main {
/*
    // 举例: 人关门，是人关的门还是门自己关上的???答案是门自己关上的，人只是给了个作用力

    boolean flag = true;

    public void open(){
        ...;
    }

    public void close(){
        ...;
    }
*/

    public static void main(String[] args) {
        girlFriend_1 gf = new girlFriend_1();
        gf.setAge(66);
        System.out.println(gf.getAge());
    }

}
