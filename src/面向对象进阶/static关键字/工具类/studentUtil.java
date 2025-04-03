package 面向对象进阶.static关键字.工具类;

import java.util.ArrayList;

/*
    @Auther: exiashow
    @Date: 2025/4/1 23:43
    @Summary: 用户计算学生中年纪最大的工具类
*/
public class studentUtil {
    private studentUtil(){};

    public static int getMaxAgeStudent(ArrayList<Student> list){
        int max = list.get(0).getAge();

        for(int i = 1; i < list.size(); i++){
            if(list.get(i).getAge() > max){
                max = list.get(i).getAge();
            }
        }
        return max;
    }
}
