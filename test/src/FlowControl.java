/**
 *流程控制 : 判断结构、选择结构、循环结构
 */

public class FlowControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//判断结构
		//1.1 if
		int i = 10;
		if(i > 5) {
			System.out.println("big");
		}
		//1.2 if-else
		int a = 70;
		if(a < 60) {
			System.out.println("不及格");
		}else {
			System.out.println("及格");
		}
		//1.3 if-else if-else
		int m = 15;
		if(m >= 1 && m <= 3) {
			System.out.println("one");
		}else if(m >= 4 && m <= 6){
			System.out.println("two");
		}else if(m >= 7 && m <= 9){
			System.out.println("three");
		}else if(m >= 10 && m <= 12){
			System.out.println("four");
		}else {
			System.out.println("false");
		}
		
		int n = 100;
		String s = "";
		if(n <= 0 || n >=13) {
			s = "非法月份";
		}
		else if(n <= 3){
			s = "春季";
		}
		else if(n <= 6){
			s = "夏季";
		}
		else if(n <= 9){
			s = "秋季";
		}
		else {
			s = "冬季";
		}
		System.out.println(s);
		
		/*选择结构-switch语句：
		 * 选择类型只有四种：byte,short，int,char
		 * case与default没有顺序.先执行第一个case，没有匹配的case执行default
		 * 结束switch语句的两种情况：遇到default，执行到switch语句结束；如果匹配的case或者default
		 * 没有对应的break，那么程序会继续向下执行，运行可以执行的语句，知道遇到break或者switch结尾结束
		 */
		int y = 2;
		//if(y <= 0 || y >=13) {
		//	s = "非法月份";
		//}
		//else {...}
		//改进：
		if(y <= 0 || y >=13) {
			System.out.println("非法月份");
			return;
			//System.out.println("非法月份"); - Unreachable code
		}
		int res = (y -1)/3;
		switch(res) {
			case 0:
				System.out.println("春");
				break;
			case 1:
				System.out.println("夏");
				break;
			case 2:
				System.out.println("秋");
				break;
			default:
				System.out.println("冬");
				break;
		}
		
		int x = 2;
		switch(x) {
			case 1:
			case 2:
			case 3:
				System.out.println("春");
				break;
			case 4:
			case 5:
			case 6:
				System.out.println("夏");
				//break;
			case 7:
			case 8:
			case 9:
				System.out.println("秋");
				break;
			case 10:
			case 11:
			case 12:
				System.out.println("冬");
				break;
			default:
				System.out.println("错误月份");
				break;
		}
		
		
		//循环语句:
		//3.1.1 while语句
		int l = 0;
		while(l <= 10) {
			System.out.println(l);
			l++;
		}
		//3.1.2 do-while语句
		l = 0;
		do {
			l++;
			System.out.println(l);
		}while(l <= 10);
		
		
		//三角形练习
//		int h = 1;
//		int num = 9;
//		while(h <= num) {
//			int w = 1;
//			while(w <= h) {
//				System.out.print("*");
//				w++;
//			}
//			h++;
//			System.out.println();
//		}

		//倒三角99乘法表
		int h = 9;
		while(h > 0) {
			int w = 9;
			while(w <= h && w > 0) {
				System.out.print(w + "*" + h + "=" + h*w + " ");
				w--;
			}
			h--;
			System.out.println();
		}
		
		//3.2 for循环 
		//for(exp1(初始表达式) ; exp2(循环条件表达式) ; exp3(循环后操作表达式)){......}
//		for(int p = 9 ; p > 0 ; p--) {
//			for(int q =9 ; q <= p && q > 0;q--) {
//				System.out.print(p*q);
//			}
//		}
		
		//while与for可以互换，区别在于for为了循环而定义的变量在for循环结束时就在内存中释放；
		//而while循环使用的变量在循环结束后还可以继续使用。
//		int o = 0;
//		for(;;) {
//			if(o % 5 == 0) {
//				continue;
//			}
//			System.out.println(o);
//			o++;
//		}//光标一直闪动，死循环
		
		//break应用于选择结构和循环结构；continue应用于循环
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
