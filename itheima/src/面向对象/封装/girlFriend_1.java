package 面向对象.封装;

/*
    @Auther: exiashow
    @Date: 2025/3/25 01:10
    @Summary: 
*/
public class girlFriend_1 {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 50) {
            this.age = age;
        }else {
            System.out.println("数据错误");
        }
    }
}
