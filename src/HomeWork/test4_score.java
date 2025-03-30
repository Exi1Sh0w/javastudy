package HomeWork;

import java.util.Scanner;

/*
    @Auther: exiashow
    @Date: 2025/3/19 14:48
    @Summary: 在唱歌比赛中，有6名评委给选手打分。分数范围是0-100之间的整数
    选手最后的得分为: 去掉最高分，去掉最低分后的4个评委的平均分
 */
public class test4_score {
    public static void main(String[] args) {
        // 分析:
        // 1.定义一个数组，用来存放6名评委的打分(0-100)
        int[] scoreArray = getScore();
        for (int i = 0; i < scoreArray.length; i++) {
            System.out.println(scoreArray[i]);
        }

        // 2.求出数组中的最大值
        int maxScore = getMax(scoreArray);

        // 3.求出数组中的最小值
        int minScore = getMin(scoreArray);
        // 4.求出数组中6个分数的总和
        int sum = getSum(scoreArray);
        // 5.(总和-最大值-最小值) / 4
        // 建议这边不要写死 除以4,这样以后代码还可以复用
        int avg = (sum - maxScore - minScore) / (scoreArray.length - 2);
        System.out.println("去掉最多分，去掉最低分，您的平均分是: " + avg);
    }

    public static int[] getScore() {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入评委的分数0-100之间哦");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;
            } else {
                System.out.println("超过0-100的范围了哦，请重新输入吧");
            }
        }
        return scores;
    }


    public static int getMax(int[] scorearray) {
        int max = scorearray[0];
        for (int i = 1; i < scorearray.length; i++) {
            if (scorearray[i] > max) {
                max = scorearray[i];
            }
        }
        return max;
    }

    public static int getMin(int[] scorearray) {
        int min = scorearray[0];
        for (int i = 1; i < scorearray.length; i++) {
            if (scorearray[i] < min) {
                min = scorearray[i];
            }
        }
        return min;
    }

    public static int getSum(int[] scorearray) {
        int sum = 0;
        for (int i = 0; i < scorearray.length; i++) {
            sum += scorearray[i];
        }
        return sum;
    }
}
