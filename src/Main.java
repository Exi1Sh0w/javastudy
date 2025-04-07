import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
/*        // x自增了两次，所以x=12
        int x = 10;
        // 先用后加，所以y=10
        int y = x++;
        // 先加后用，所以z=12
        int z = ++x;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);*/

/*        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int randomNum = random.nextInt(100);
            array[i] = randomNum;
            System.out.println(array[i]);
        }*/

        //调用 change(number) 时，number 的值（即 100）被复制一份，传递给 change 方法的参数 number。
        //此时，main 方法中的 number 和 change 方法中的 number 是两个独立的变量，它们只是碰巧同名，初始值也相同（100），但它们占据不同的内存空间。
        int number = 100;
        System.out.println("调用前:" + number);
        change(number);
        System.out.println("调用后:" + number);


        int[] arr = {10, 20, 30};
        System.out.println("调用前:" + arr[1]);
        change2(arr);
        System.out.println("调用后" + arr[1]);

    }


    public static void change(int number){
        number = 200;
        System.out.println("change中的num:" + number);
    }


    public static void change2(int[] arr){
        arr[1] = 200;
    }
}