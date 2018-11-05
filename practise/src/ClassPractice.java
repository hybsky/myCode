public class ClassPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		System.out.println(c.getColor());
		Car c1 = new Car("white" , 4);
		//System.out.println(c1.getColor());
		System.out.println(c1.getTires());
	}

}

class Car{
	private String color = "black";
	private int tires;
	public Car() {
		System.out.println("无参构造函数");
	}
	public Car(String color ) {
		this();
		this.color = color;
		System.out.println("1");
	}
	public Car(String color , int tires) {
		this(color);
		this.color = color;
		this.tires = tires;
		System.out.println("2");
	}
	public String getColor(){
		return color;
	}
	public int getTires() {
		return tires;
	}
}