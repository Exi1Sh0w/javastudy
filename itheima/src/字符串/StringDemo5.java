package 字符串;

/*
    @Auther: exiashow
    @Date: 2025/3/27 21:45
    @Summary: 敏感词替换
*/
public class StringDemo5 {
    public static void main(String[] args) {
        String talk = new String("小学生你玩的真菜啊!!CNM,GB");
        // System.out.println(talk.replace("CNM", "你好"));

        String[] arr = new String[]{"CNM", "TMD", "GB", "SB"};

        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);
           talk = talk.replace(arr[i], "***");
        }

        System.out.println(talk);
    }
}
