public class ArrayDemo2 {
	//多维数组
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//二位数组
		//1.1定义赋值1
		int[][] arr = new int[3][3];
		int num = 1;
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		
		//1.2定义赋值2
		int[][] arr2 = {{1},{1,2},{1,2,3}};
		
		//1.3定义赋值3
		int[][] arr3 = new int[3][];
		arr3[0] = new int[] {1,2,3};
		arr3[1] = new int[] {4,5,6};
		arr3[2] = new int[] {7,8,9};
		
		outArray(arr3);
		reverse(arr3);
		outArray(arr3);
		//三维数组
	}
	public static void outArray(int[][] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arr[i][j] + (" "));
			}
			System.out.println();
		}
	}
	
	//矩阵转换
	public static void reverse(int[][] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < i ; j++) {//若j<arr[i].length,则转置两次，恢复原样
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
	}
}
