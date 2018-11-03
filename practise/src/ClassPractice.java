public class ClassPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		System.out.println(c.getColor());
		Car c1 = new Car("white" , 4);
		System.out.println(c1.getColor());
		System.out.println(c1.getTires());
	}

}

class Car{
	private String color = "black";
	private int tires;
	public Car() {
		
	}
	public Car(String c , int t) {
		color = c;
		tires = t;
	}
	public String getColor(){
		return color;
	}
	public int getTires() {
		return tires;
	}
}