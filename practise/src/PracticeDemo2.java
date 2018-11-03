public class PracticeDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte范围转换：-128～127->0~256
		byte x = -100;
		int i = x & 0xff;
		System.out.println(i);
		
		int[] arr1 = new int[] {1,2,3,4,5};
		int[] arr2 = new int[9] ;
		copy(arr1 , arr2);
		
		tran(5);
		
		int[][][] arr3 = new int[][][] {
			{{1,2,3},{4,5,6},{7,8,9}},
			{{1,2,3},{4,5,6},{7,8,9}},
			{{1,2,3},{4,5,6},{7,8,9}}
		};
		threeArray(arr3);
		
	}
	
	//数组拷贝，或截取或回转
	public static void copy(int[] arr , int[] arr_copy) {
		if(arr.length >= arr_copy.length) {
			for(int i = 0 ; i < arr_copy.length ; i++) {
				arr_copy[i] = arr[i];
			}
		}
		//回转
		else {
			for(int j = 0 ; j < arr_copy.length ; j++) {
				arr_copy[j] = arr[j % arr.length];
			}
		}
		for(int ii : arr_copy) {
			System.out.print(ii + " ");
		}
		System.out.println();
	}
	
	//输出整数的二进制表示形式
	public static void tran(int n) {
		for(int i = 31 ; i >= 0 ; i--) {
			System.out.print((n >> i) & 0x1);
		}
		System.out.println();
	}
	
	//三维数组横向输出
	public static void threeArray(int[][][] arr) {
		for(int j = 0 ; j < arr[0].length ; j++) {
			for(int i = 0 ; i < arr.length ; i++) {
				for(int k = 0 ; k < arr[i][j].length ; k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
