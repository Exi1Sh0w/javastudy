package 数组;

/*
    @Auther: exiashow
    @Date: 2025/3/24 13:37
    @Summary: 二维数组。当需要把数据分组管理的时候，就需要用到二维数组啦
*/
public class ArrayDemo5 {
    public static void main(String[] args) {
/*        // 静态初始化
        // int[][] arr = new int[][]{{1,2,3},{4,5,6}};
        // 简化版本:
        int[][] arr = {
                // 建议二维数组写成这种格式的，比较清晰
                {1,2,3},
                {4,5,6}
                };

        // System.out.println(arr[0]); //[I@34a245ab，获取二维数组的第一个数组
        // 正确的打开方式
        System.out.println(arr[0][0]); // 1


        // 二维数组遍历
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }*/


        // 动态初始化
        // 格式: 数据类型[][] 数组名 = new 数据类型[m][n];
        //      m表示这个二维数组可以存放多少个一维数组
        //      n表示每一个一维数组可以存放多少个元素

        //int[][] arr = new int[2][3]; // 该数组可以存放2个一维数组，每个一维数组中可存放3个int类型元素

/*        int[][] arr= new int[3][5];
        arr[0][3] = 6;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }*/


        // 小练习。 某商城每个季度的营业额如下: 单位(万元)
        // 第一季度 22,66,44
        // 第二季度 77,33,88
        // 第三季度 25,45,65
        // 第四季度 11,66,99
        // 要求计算出每个季度的总营业额和全年的总营业额

        // 1.创建二维数组并存储数据
        int[][] yearArrar = new int[][]{
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };

        // 2.遍历二维数组，得到每一个一维数组并求和
        // 表示全年的营业额
        int yearSum = 0;
        for (int i = 0; i < yearArrar.length; i++) {
            int[] quarterArr = yearArrar[i];
            int sum = getSum(quarterArr);
            System.out.println("第" + (i + 1) + "个季度的总营业额为:" + sum);
            yearSum += sum;
        }
        System.out.println("全年的总营业额:" + yearSum);
    }

    // 定义一个方法，计算每个季度的营业额
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
