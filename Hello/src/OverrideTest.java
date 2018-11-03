public class OverrideTest extends OverrideParent{
	
	//重写快捷键：Alt+/  回车
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		//return super.add(a, b);
		return a*b;
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		OverrideTest ot = new OverrideTest();
		int result = ot.add(3, 7);
		System.out.println(result);
		
	}
	
	

}


class OverrideParent{
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a) {
		return a;
	}
}