package 面向对象.一个标准的javaBean;

/*
    @Auther: exiashow
    @Date: 2025/3/25 22:21
    @Summary: 以一个注册页面作为例子来编写标准的javaBean类
*/
public class User {
    // 属性
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    
    // 空参
    public User(){

    }
    // 带全部参数的
    public User(String username, String password, String email, String gender, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;

    }
}
