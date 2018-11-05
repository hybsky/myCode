public class ClassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RichPerson y = new RichPerson();
		System.out.println(y.getMoney());
		y.setMoney(100);
		System.out.println(y.getMoney());
		y.setMoney(1000000000);
		System.out.println(y.getMoney());
		
		RichPerson x = new RichPerson("tony");
		System.out.println(x.getName());
		RichPerson z = new RichPerson("lucy" , 20);
		System.out.println(z.getName() + "---" + z.getAge());

		//访问静态变量，直接进行类的访问
		System.out.println(RichPerson.color);
		x.getColor();
	}

}
//封装
class RichPerson{
	private  int money = 1000000;
	private String name;
	private int age;

	//构造代码块
	{
		System.out.println("构造代码块");
	}

	public static String color = "red";

	//静态代码块，
	static {
		System.out.println("静态代码块");
		//静态代码块只能访问静态成员，无法访问非静态
		System.out.println(color);
	}

	//静态方法，只能访问静态成员
	public static void getColor(){
		System.out.println(color);
	}

	//构造函数，类中未定义时，jvm自动分配一个空构造函数；有定义时，不分配
	public RichPerson() {
		System.out.println("RichPerson");
	}
	public RichPerson(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public RichPerson(String n , int a) {
		name = n;
		age = a;
		System.out.println("构造函数");
	}
	
	public int getMoney() {

		return money;
	}
	
	
	
	public int getAge() {

		return age;
	}
	
	public void setAge(int age) {
		age = age;
	}
	
	public void setName(String name) {
		name = name;
	}
	
	public void setMoney(int m) {
		if(m > money) {
			money = m;
		}
	}
	
}