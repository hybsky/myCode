public class ExceptionDemo12 {
    public static void main(String[] args) {
        System.out.println(div(10,5));
    }
    public static int div(int a, int b){
        try {
            int c = a / b;
            int[] arr = {1,2,3,4,5};
            //arr = null;
            //System.out.println(arr.length);
            System.out.println("test");
            return c;
        }catch (NullPointerException e){
            System.out.println("空指针异常");
        }catch (ArithmeticException e){
            System.out.println("被除数不能为0");
        }catch (Exception e){
            System.out.println("异常");
        }finally {
            System.out.println("......");
            //return 3;
        }
        return -1;
    }
}
