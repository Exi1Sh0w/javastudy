package 集合进阶;

import java.util.ArrayList;
import java.util.Collection;

/*
    @Auther: exiashow
    @Date: 2025/4/10 00:11
    @Summary: 
*/
public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();

        // 1.添加元素,因为是list集合，所以可以重复
        coll.add("aaa");
        coll.add("aaa");
        coll.add("bbb");
        System.out.println(coll);

/*        // 2.清空元素
        coll.clear();
        System.out.println(coll);*/

        // 3.删除
        // 注意： 因为Collection里面定义的是共性的方法，所以此时不能通过索引进行删除，只能通过元素的对象和进行删除
        // 方法会有一个布尔类型的返回值，删除成功返回true，反之false(当要删除的元素不存在，就会删除失败)
        coll.remove("bbb");
        System.out.println(coll.remove("ddd"));
        System.out.println(coll);

        // 4.判断元素是否包含
        // 注意: 底层是equals方法判断是否存在的。所以如果集合中存储的是自定义对象并想通过contains方法来判断是否包含，那么一定要在javabean类中重写equals方法
        boolean result1 = coll.contains("aaa");
        System.out.println(result1);

        // 5.判断元素是否为空
        boolean result2 = coll.isEmpty();
        System.out.println(result2);

        // 6.获取集合的长度
        int size = coll.size();
        System.out.println(size);

    }
}
