public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyInterface mi = new MyInterface();
	}  

}

//接口使用interface关键字，接口中所有的方法都是抽象方法，接口不能实例化
//接口弥补了java中单继承的不足
interface MyInterface{
	public int add(int a , int b);//abstract关键字可加可不加（通常不加）
	public void input(String string);
}

interface MyInterface2{
	public void output(String string);
}

class ClassTest3{
	
}
/**
 * 类实现接口使用关键字implements，如果一个类实现一个接口，那么就要实现接口中所有的抽象方法
 * 否则需要设计为抽象类
 *一个类可以继承一个类，同时可以实现多个接口
 */
class MyClass extends ClassTest3 implements MyInterface,MyInterface2{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void input(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void output(String string) {
		// TODO Auto-generated method stub
		
	}
	
}
















