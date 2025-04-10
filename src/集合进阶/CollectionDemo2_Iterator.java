package 集合进阶;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.function.Consumer;

/*
    @Auther: exiashow
    @Date: 2025/4/10 00:35
    @Summary: 三种遍历方式-迭代器遍历/增强型for循环/lambda表达式。
    如果只是单纯的遍历，那都可以。但建议使用后两者
    如果需要删除，只能使用迭代器遍历

    迭代器不依赖索引
*/
public class CollectionDemo2_Iterator {
    //    Iterator<E> iterator; 返回迭代器对象，默认指向当前集合的0索引
    public static void main(String[] args) {

        // 1.添加集合并创建元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        // 2.获取迭代器
        Iterator<String> iterator = coll.iterator();

        // 3.利用循环不断获取集合中的每一个元素
        // 判断当前指向的位置是否有元素dd
        while (iterator.hasNext()) {
            // 获取当前指向的元素并移动指针
            //System.out.println(iterator.next());
            String str = iterator.next();
            if ("bbb".equals(str)) {
                iterator.remove();
            }
        }
        System.out.println(coll);

/*        // 第二个知识点，增强型for循环。底层还是调用的迭代器
        for (String str : coll) {
            System.out.println(str);
        }*/

//        // 第三个知识点，lamdba表达式
//        coll.forEach(s -> System.out.println(s));

/*        // 课外知识，匿名类函数
        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
    }
}
