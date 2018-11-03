public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义数组1
		int[] arr = new int[10];
		System.out.println(arr.length);//length是属性
		
		//定义数组2，并初始化
		int arr2[] = new int[] {1,2,3};
		System.out.println(arr2[2]);
		// java.lang.ArrayIndexOutOfBoundsException索引越界
		//System.out.println(arr2[3]);
		// java.lang.NullPointerException空指针异常
		//int arr3[] = null;
		//System.out.println(arr3.length);
		//null，对象不存在，不能访问其方法和属性，否则出现空指针异常
		int[] arr3 = null;
		System.out.println(arr3 == null ? "-1" : arr3.length);
		
		//定义数组3
		int[] arr4 = {1,2,3};
		
		int[] arr5 = new int[50];
		for(int i = 0 ; i < arr5.length; i++) {
			arr5[i] = i + 1;
		}
		outArray(arr5);
		System.out.println();
		System.out.println(getMax(arr5));
	}
	
	//输出数组内容
	public static void outArray(int[] arr) {
		if(arr != null && arr.length > 0) {
			for(int i = 0 ; i < arr.length ; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	}
	
	//获取数组最大值
	public static int getMax(int[] arr) {
		if(arr == null || arr.length == 0) {
			return -1;
		}
		int max = arr[0];
		for(int i = 1 ; i < arr.length ; i++) {
			max = max > arr[i] ? max : arr[i];
		}
		return max;
	}
	
	
	
	
	
	
	
	
}
