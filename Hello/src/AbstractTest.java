public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Rectangle(4,5);
		System.out.println(s.area());
		System.out.println(s.getVolumn(3));
		
		Shape s1 = new Triangle(8,10);
		System.out.println(s1.area());
		
		Shape s2 = new Circle(10,13);
		System.out.println(s2.area());
	}

}

//抽象类  四边形
abstract class Shape{
	protected int width;
	protected int height;
	
	public Shape(int width , int height) {
		this.width = width;
		this.height = height;
	}
	
	public abstract double area();
	
	public double getVolumn(int h) {
		return this.area() * h;
	}
	
}

//矩形面积：长*宽
class Rectangle extends Shape{
	public Rectangle(int width,int height) {
		super(width,height);
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.height * this.width;
	}
}

//三角形：长*宽/2
class Triangle extends Shape{
	public Triangle(int width,int height) {
		super(width,height);
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.height * this.width / 2;
	}
}

//圆
class Circle extends Shape{
	public Circle(int width,int height) {
		super(width,height);
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.width * this.width * Math.PI;
	}
}







