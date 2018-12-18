public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//空心三角形
//		int n = 5;
//		for(int i = 1; i <= n; i++) {
//			for(int j = 1; j <= n - i; j++) {
//				System.out.print(" ");
//			}
//			for(int k = 1; k <= 2 * i - 1; k++) {
//				if(i == 1 || i == n) {
//					System.out.print("*");
//				}else {
//					if(k == 1 || k == 2 * i - 1) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					}
//				}
//			}
//			System.out.println();
//		}
		//圣诞树
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 4; j++) {
//				for (int k = 0; k < 4 - j; k++) {
//					System.out.print(" ");
//				}
//				for (int m = 0; m < 2 * j + 1; m++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//		}
//		for (int n = 0; n < 5; n++) {
//			for (int o = 0; o < 3; o++) {
//				System.out.print(" ");
//			}
//			for (int p = 0; p < 3; p++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		for (int i = 1; i <= 3; i++) {
			for (int m = 1; m <= 3; m++) {
				for (int j = 1; j <= 3 * (3 - i); j++){
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					for (int k = 1; k <= 3-m; k++){
						System.out.print(" ");
					}
					for (int k = 1; k <= 2*m-1; k++){
						System.out.print("*");
					}
					for (int k = 1; k <= 3-m; k++){
						System.out.print(" ");
					}
					System.out.print(" ");
				}
				System.out.println();
			}
		}
		for (int n = 0; n < 5; n++) {
			for (int o = 0; o < 7; o++) {
				System.out.print(" ");
			}
			for (int p = 0; p < 3; p++) {
				System.out.print("*");
			}
			System.out.println();
		}


//		int[] ints={1,3,5,3,5,7,3,5,7,11,3,3,3};
//
//		String result=null;
//
//		String xingxing="*";
//
//		System.out.println("圣诞树：");
//
//		for(int i=0;i<ints.length;i++){
//
//			result="";
//
//			for(int j=0;j<20-xingxing.length()*(ints[i]/2);j++){
//
//				result+=" ";
//
//			}
//
//			for(int j=0;j<ints[i];j++){
//
//				result+=xingxing;
//
//			}
//
////			result+="\n";
//
//			System.out.println(result);
//
//		}

	}

}
