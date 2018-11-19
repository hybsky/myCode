/**单例设计模式：保证一个类仅有一个实例，并提供一个访问它的全局访问点。 
 * 1、构造方法私有化
 * 2、声明一个本类对象
 * 3、给外部提供一个静态方法获取对象实例
 * */
public class SingletonModle {
    public static void main(String[] args) {
        Singleton2 s = Singleton2.getSingleton2();
        s.print();
        Singleton2 s2 = Singleton2.getSingleton2();
        s2.print();
        System.out.println(s == s2);
    }
}
//饿汉式
class Singleton{
    private Singleton(){
    }
    private static Singleton s = new Singleton();
    public static Singleton getSingleton(){
        return s;
    }
    public void print(){
        System.out.println("饿汉式单例模式");
    }
}

//懒汉式
class Singleton2{
    private Singleton2(){}
    private static Singleton2 s;
    public static Singleton2 getSingleton2() {
        if (s == null){
            s = new Singleton2();
        }
        return s;
    }
    public void print(){
        System.out.println("懒汉式单例模式");
    }
}