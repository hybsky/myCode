public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {10,32,9,23,19,45,27,81};
		System.out.println(getMax(arr));
		
		bubbleSort(arr);
		//增强for循环
		for(int ii : arr) {
			System.out.print(ii + " ");
		}
		System.out.println();
		
		int[] arr2 = new int[] {10,32,9,23,19,45,27,81};
		selectSort(arr2);
		//增强for循环
		for(int ii : arr2) {
			System.out.print(ii + " ");
		}
		System.out.println();
		
		int[] arr3 = new int[] {1,3,5,7,9,11,131,590,999,1111};
		binarySearch(arr3,11);
		
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
	
	//冒泡排序
	public static void bubbleSort(int[] arr) {
		for(int i = arr.length - 1 ; i > 0 ; i--) {
			for(int j = 0 ; j < i ; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	
	//选择排序
	public static void selectSort(int[] arr) {
		for(int i = 0 ; i < arr.length -1 ; i++) {
			for(int j = i + 1 ; j < arr.length ; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	//折半查找（二分法） binarySearch
	public static void binarySearch(int[] arr , int a) {
		int min = 0;
		int max = arr.length - 1;
		int index = -1;
		while(min <= max) {
			int middle = (min + max) / 2;
			//找到了
			if(arr[middle] == a) {
				index = middle;
				break;
			}
			//范围落在右半边
			else if(arr[middle] < a) {
				min = middle + 1;
			}
			//范围落在左半边
			else {
				max = middle - 1;
			}
		}
		System.out.println(index);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
