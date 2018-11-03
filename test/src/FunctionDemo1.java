public class FunctionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World");
		message("Hello World");
		//调用函数
		int a = 1;
		int b = 2;
		int c = add(a,b);
		System.out.println(c);
		
		System.out.println(max(1,2,4));
		
		table99();
		
		System.out.println("0!=" + fac(0));
	}
	
	public static int add(int a,int b) {
		int res = a + b;
		return res;
	}
	//打印函数
	public static void message(String msg) {
		System.out.println(msg);
	}
	
	//max(a,b,c),最大值
	public static int max(int a, int b, int c) {
		int max = a > b ? a : b;
		max = max > c ? max : c;
		return max;
	}
	
	//累加
	public static int sum(int a) {
		int sum = 0;
		for(int i = 0; i <= a; i++) {
			sum = sum + i;
		}
		return sum;
	}
	
	//99乘法表
	public static void table99() {
		int row = 9;
		for(int i = 1 ; i <= row ; i++) {
			for(int j = 1 ; j <= i  ; j++) {
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
			}
			System.out.print("\r\n");//System.out.println();
		}
	}
	
	//阶乘
	public static int fabric(int a) {
		if(a <= 0) {
			return -1;
		}
		int res = 1;
		for(int i = 1; i <= a ; i++) {
			res = res * i;
		}
		return res;
	}
	//递归计算阶乘
	public static int fac(int a) {
		if(a <= 1) {
			return 1;
		}
		return a * fac(a-1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
