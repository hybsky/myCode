import java.util.*;

public class zf {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        try {
        	 //�����ĸ���
            int count1 = 0;

            //�����ĸ���
            int count2 = 0;

            int input = s.nextInt();

            while (input != 0) {
                if (input > 0) {
                    count1++;
                } else {
                    count2++;
                }
                input = s.nextInt();
            }

            System.out.println("正数" + count1 + "," + "负数" + count2);
        }
       

        finally {
        	s.close();
        }
    }
}