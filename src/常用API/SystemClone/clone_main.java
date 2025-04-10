package 常用API.SystemClone;

import com.google.gson.Gson;

/*
    @Auther: exiashow
    @Date: 2025/4/9 22:03
    @Summary: object中的clone是浅克隆
    细节:
        1.重写object中clone方法
        2.让javabean类实现Cloneable接口
        3.创建原对象并调用clone就可以了
*/
public class clone_main {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] date = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        user u1 = new user(1, "zhangsan", "123456", "boy111", date);

        user u2 = (user) u1.clone();

        System.out.println(u1);
        System.out.println(u2);

        // gson是第三方工具，需要先安装哦...
        // 可以利用该工具实现深克隆
        Gson g = new Gson();
        // 变成json格式了
        String s1 = g.toJson(u1);
        System.out.println(s1);

        // 从json变回对象
        user s2 = g.fromJson(s1, user.class);
        System.out.println(s2);
    }
}
