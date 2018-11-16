import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;
public class TriangleException {
    public static void main(String[] args) {

        int []s=new int[3];
        System.out.println("请输入三条边：");
        Scanner in=new Scanner(System.in);
        try {
            for(int i=0;i<s.length;i++){
                //hasNextInt()方法是判断控制台接收是否为数字
                if(in.hasNextInt())
                    s[i]=in.nextInt();
                else
                    //InputMismatchException:Java执行时发生异常,但是无法跳到Catch异常区块
                    throw new InputMismatchException();
            }
            Arrays.sort(s);
            Triangle t=new Triangle();
            t.triangle(s[0], s[1], s[2]);
        }catch(IllegalArgumentException e) {
            System.err.println(s[0]+","+s[1]+","+s[2]+",不能构成三角形");
        }catch(InputMismatchException e) {
            System.err.println("请输入整数作为三角形的边长！");
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Triangle {
    int a,b,c;
    void triangle(){

    }
    void triangle(int a,int b,int c)throws Exception{
        this.a=a;
        this.b=b;
        this.c=c;
        if(a+b>c||c-a<a){
            System.out.println("构成三角形的三条边为："+this.a+","+this.b+","+this.c);
        }else{
            // IllegalArgumentException此异常表明向方法传递了一个不合法或不正确的参数。
            throw new IllegalArgumentException();
        }
    }
}
