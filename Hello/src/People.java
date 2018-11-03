public class People {

	private String name;
	private int age;
	private String address;
	private String phoneNumber;
	
	public String getName() {
		return this.name;//return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	/*
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hello World!";
	}
	*/
	
	public static void main(String[] args) {
		People p = new People();
		//当我们直接打印引用类型的时候，默认会调用toString()方法，该方法是从Object这个类中继承下来的
		System.out.println(p);//包名+类名组成的完整的类名+@+哈希码的十六进制数字
		//System.out.println(p.toString());
		System.out.println(p.hashCode());
	}
	
}
