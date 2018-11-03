class Human{
	String name;
	int age;
	String sex;
	String addr;
	public Human() {
		name = null;
		age = 0;
		sex = null;
		addr = null;
		System.out.println("第一个构造函数");
	}
	public Human(String pName,int pAge) {
		name = pName;
		age = pAge;
		System.out.println("第二个构造函数");
	}
	public Human(String pName,int pAge,String pSex,String pAddr) {
		//this
		this(pName,pAge);
		name = pName;
		age = pAge;
		sex = pSex;
		addr = pAddr;
		System.out.println("第三个构造函数");
	}
}

public class HumanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human zhangsan = new Human();
		Human wangwu = new Human("wangwu",26,"男","哈尔滨");
		Human lisi = new Human("lisi",22);
		System.out.println(zhangsan.name);
		System.out.println("姓名："+wangwu.name+"年龄："+wangwu.age);
		
	}

}
