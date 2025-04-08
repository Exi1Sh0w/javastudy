package 面向对象进阶.内部类.Demo2;

/*
    @Auther: exiashow
    @Date: 2025/4/8 15:27
    @Summary: 匿名内部类！！！非常重要！！

    使用场景:
        当方法的参数是接口或是类时。以接口为例，可以传递这个接口的实现类对象
        如果实现类只要使用一次，就可以用匿名内部类简化代码。而需要再新建一个类


*/
public class testMain {
//    // 匿名内部类本质上就是隐藏了名字的内部类
//
//    格式:
//        new 类名或接口名() {
//            重写方法;
//    }
//
//    // 举例
//    new Inter(){
//        public  void show(){
//
//        }
//    }

    public static void main(String[] args) {

        // 从new Swim()开始，我们可以理解为是Swim()接口的实现类对象
        // 接口多态
       Swim s =  new Swim() {
            // 重写所有的方法
            @Override
            public void swim() {
                System.out.println("重写了游泳的方法");
            }

       };

        // 既然是对象，那就可以调用方法啦..
        new Swim() {
            // 重写所有的方法
            @Override
            public void swim() {
                System.out.println("重写了游泳的方法");
            }

            // 可以调用自身所有重写的方法....
        }.swim();


            // 如果Dog类只需要运行一次的话，使用下面的代码哦...
        method(
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("狗狗吃骨头");
                    }
                }
        );

        s.swim();


//        Dog dog = new Dog();
//        method(dog);
    }


    public static void method(Animal a) {  // Animal a = 子类对象   标准的多态~
        a.eat(); // 编译看左边，运行看右边
    }
}
