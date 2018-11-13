public class ExceptionDemo1 {
    public static void main(String[] args) {
//        int[] arr = {1};
//        //System.out.println(arr[1]);
//        Exception e = new Exception();
//        Exception e2 = new Exception("出错了");
//        //打印异常消息
//        System.out.println(e2.getMessage());
//        //打印栈跟踪消息
//        e2.printStackTrace();
        //抛出异常
        test();
    }
    public static void test(){
        try{
            throw new Exception("出错了");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("抓住了");
        }
    }
}
