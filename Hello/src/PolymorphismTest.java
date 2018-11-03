public class PolymorphismTest {//多态

	public static void main(String[] args) {
		/*Car car = new BMW();
		BMW bmw = car;//f : BMW bmw = (BMW)car;
		bmw.run();*/
		
		/*
		  BMW bmw = new Car();//f
		  Car car = bmw;
		 */
		
		/*
		Car car = new Car();
		Car car1 = new Measidise();
		car1 = car;
		*/
		
		/*
		Car car = new Car();
		Car car1 = new Measidise();
		car = car1;
		*/
		
		/*
		Car car = new Measidise();
		BMW bmw = car;//f:BMW bmw = (BMW)car;
		*/
	}

}


class Car {
	public void run() {
		System.out.println("Car");
	}
}

class BMW extends Car{
	public void run() {
		System.out.println("BMW");
	}
}

class Measidise extends Car{
	public void run() {
		System.out.println("Measidise");
	}
}
