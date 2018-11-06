public class ExtendsFatSon {
    public static void main(String[] args) {
        Father f = new Father();
        System.out.println(f.age);
        Son s = new Son();
        s.run();
    }
}
class Father{
    public String name;
    final int age = 100;
    private int asset;

    public void setAsset(int asset){
        this.asset = asset;
    }
    public int getAsset(){
        return asset;
    }
    public static void walk(){
        System.out.println("FatherWalking");
    }
}
//final修饰类时不能被继承，修饰方法时不能被覆盖，修饰变量时不能修改，成为常量
final class Son extends Father{
    public void run(){
        super.walk();
        System.out.println("SonRunning");
    }
    //错误：子类中的walk()无法覆盖父类中的静态的walk()方法
    //public void walk(){}
    //若父类为void walk(){},子类为public void walk(){}成立，子类权限较大，可覆盖父类方法
}