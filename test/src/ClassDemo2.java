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
	}

}
//封装
class RichPerson{
	private  int money = 1000000;
	private String name;
	private int age;
	
	//构造函数，类中未定义时，jvm自动分配一个空构造函数；有定义时，不分配
	public RichPerson() {
		
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