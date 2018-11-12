import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//双色球案例
public class BallGame {
    public static void main(String[] args) {
        Random r = new Random();
        //红球池
        int[] redBalls = new int[33];
        int len = redBalls.length;
        for (int i = 0; i < len; i++){
            redBalls[i] = i + 1;

        }

        //用户选择的红球数组
        int[] userRed = new int[6];
        //用户选择的蓝球数组
        int userBlue = 0;
        //系统选择的红球数组
        int[] systemRed = new int[6];
        //系统选择的蓝球数组
        int systemBlue = 0;
        //中奖红球个数
        int numRed = 0;
        //中奖蓝球个数
        int numBlue = 0;

        System.out.println("请输入选择方式：（1.机选；2.人选）");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        switch (num){
            //机选
            case 1:
                //机选红球
                computerSelect(redBalls , userRed);
                //System.out.println(Arrays.toString(userRed));
                //机选蓝球
                userBlue = r.nextInt(16) + 1;
                //System.out.println(userBlue);
                break;

            //人选
            case 2:
                //人选红球
                System.out.println("请输入6个不重复的红球号码（1-33）：");
                for (int i = 0; i <userRed.length; i++){
                    userRed[i] = input.nextInt();
                }
                //人选蓝球
                System.out.println("请输入1个蓝球号码（1-16）：");
                userBlue = input.nextInt();
                //System.out.println(Arrays.toString(userRed));
                //System.out.println(userBlue);
                break;
        }

        //系统选出中奖号码
        //红球
        computerSelect(redBalls , systemRed);
        //System.out.println(Arrays.toString(systemRed));
        //蓝球
        systemBlue = r.nextInt(16) + 1;
        //System.out.println(systemBlue);

        //中奖号码与用户号码匹配
        //红球
        for (int i = 0; i < userRed.length; i++){
            int compareRedNum = systemRed.length - numRed;
            for (int j = 0; j < compareRedNum;j++){
                if (userRed[i] == systemRed[j]){
                    int temp = systemRed[j];
                    systemRed[j] = systemRed[compareRedNum - 1];
                    systemRed[compareRedNum - 1] = temp;
                    numRed++;
                    break;
                }
            }
        }
        //蓝球
        if (userBlue == systemBlue){
            numBlue++;
        }

        Arrays.sort(userRed);
        Arrays.sort(systemRed);
        System.out.println("您选择的红球：" + Arrays.toString(userRed) + "，您选择的蓝球：" + userBlue);
        System.out.println("中奖红球号码：" + Arrays.toString(systemRed) + "，中奖蓝球号码：" + systemBlue);
        //System.out.println(numRed);
        //System.out.println(numBlue);

        //中奖结果判断
        if (numRed <= 3 && numBlue == 0){
            System.out.println("很遗憾，没中奖");
        }else if (numRed < 3 && numBlue == 1){
            System.out.println("六等奖，5元");
        }else if ((numRed == 3 && numBlue == 1) || (numRed == 4 && numBlue == 0)){
            System.out.println("五等奖，10元");
        }else if ((numRed == 4 && numBlue == 1) || (numRed == 5 && numBlue == 0)){
            System.out.println("四等奖，200元");
        }else if (numRed == 5 && numBlue == 1){
            System.out.println("三等奖，3000元");
        }else if (numRed == 6 && numBlue == 0){
            System.out.println("二等奖，100000元");
        }else if (numRed == 6 && numBlue == 1){
            System.out.println("一等奖，5000000元");
        }else {
            System.out.println("很遗憾，没中奖");
        }
    }

    //机选红球，balls---redBalls
    public static void computerSelect(int[] balls , int[] redBalls){
        Random r = new Random();
        for (int i = 0; i < redBalls.length; i++){
            //随机生成红球机选数字
            int index = r.nextInt(balls.length - i);
            redBalls[i] = balls[index];
            //去掉已选择的数字号码
            balls[index] = balls[balls.length - i -1];
        }
    }
}
