package 集合;

import java.util.ArrayList;

/*
    @Auther: exiashow
    @Date: 2025/3/30 23:04
    @Summary: 
*/
public class ArrayList_main {
    public static void main(String[] args) {
        // <>泛型: 集合中只能存储非基本类型
        ArrayList<String> list = new ArrayList<String>();
        // 如果需要存基本类型， 只能用其包装类。比如int的包装类就是Integer
        ArrayList<Integer> num = new ArrayList<Integer>();

        // 添加集合
        // add无论添加什么都会返回true
        boolean result = list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        System.out.println(result);
        System.out.println(list);

        // 删除集合,可以指定内容以及索引下表
        list.remove("cccc");
        list.remove(0);
        System.out.println(list);

        // 修改
        list.set(0, "dddd");
        System.out.println(list);

        // 查询
        System.out.println(list.get(0));

        // 查询长度
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
