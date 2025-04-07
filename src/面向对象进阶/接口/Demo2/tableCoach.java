package 面向对象进阶.接口.Demo2;

/*
    @Auther: exiashow
    @Date: 2025/4/7 22:15
    @Summary: 
*/
public class tableCoach extends Coach implements SpeakEnglish {
    public tableCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }
}
