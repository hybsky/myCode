public class ExceptionDemo121 {
    public static void main(String[] args) {
        try {
            System.out.println(div121(10,1));
        }catch (ArithmeticException e){
            System.out.println("被除数不能为0");
        }catch (NullPointerException e){
            e.printStackTrace();
        }

    }
    public static int div121(int a, int b) throws ArithmeticException{
        if (b == 1){
            throw new NullPointerException("除数为1，没有意义");
        }
        int c = a / b;
        return c;
    }
}