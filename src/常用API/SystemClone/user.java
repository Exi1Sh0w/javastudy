package 常用API.SystemClone;

import java.util.Arrays;
import java.util.StringJoiner;

/*
    @Auther: exiashow
    @Date: 2025/4/9 22:03
    @Summary: 
*/

// Cloneable。如果一个接口里没有抽象方法，表示当前的接口是一个标记型接口。
// 当使用Cloneable实现，那么当前类的对象就可以被克隆，如果没有实现，当前类的对象就无法被克隆
public class user implements Cloneable {
    // 游戏角色
    private int id;
    // 用户名
    private String username;
    // 密码
    private String password;
    // 游戏图片
    private String path;
    // 游戏进度
    private int[] date;


    public user() {
    }

    public user(int id, String username, String password, String path, int[] date) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getDate() {
        return date;
    }

    public void setDate(int[] date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "角色编号: " + id + ", 用户名:" + username + ", 密码:" + password + ", 游戏图片:" + path + ", 进度: " + arrToString();
    }

    public String arrToString() {
        StringJoiner sj = new StringJoiner(",","[", "]");
        for (int i = 0; i < date.length; i++) {
            sj.add(date[i] + "");
        }
        return sj.toString();
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 调用父类中的clone方法
        // 相当于让java帮我们克隆一个对象，并把可控之后的对象返回出去
        return super.clone();
    }
}
