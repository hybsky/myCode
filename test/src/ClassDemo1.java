public class ClassDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 局部变量没有默认的初始值
		 * int i;
		 * System.out.println(i);
		*/
		
		//创建对象，p为局部变量
		People p = new People();
		People p1 = p;
		//People p1 = new People();
		p.height = 180;
		System.out.println(p1.height);
		//调用函数方法
		p.run();
		//p = null;
		//p.run();
		
		//匿名对象调用一次方法
		new People().run();
		//将匿名对象作为参数进行传递
		run0(new People());
		
	}
	public static void run0(People p) {
		p.run();
	}

}
//定义类
class People{
	//成员变量===属性===字段
	int name;
	int height = 100;
	//定义成员函数
	public void run() {
		System.out.println( weight + "===run");
	}
	
	int weight;
}