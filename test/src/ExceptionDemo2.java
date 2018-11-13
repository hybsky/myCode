public class ExceptionDemo2 {
    public static void main(String[] args) {
        int[] arr = null;
        outArr(arr);
    }
    public static void outArr(int[] arr){
        try {
            for (int i = 0; i < arr.length; i++){
                System.out.println(arr[i] + " ");
            }
        }catch(Exception e){
            System.out.println("数组输出有问题");
        }
    }
}
