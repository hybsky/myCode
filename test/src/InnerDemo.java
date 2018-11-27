/**   匿名内部类
 匿名内部类就是没有名字的内部类。
 匿名内部类的三种情况：
 （1）继承式的匿名内部类
 （2）接口式的匿名内部类
 （3）参数式的匿名内部类

 在使用匿名内部类时，要记住以下几个原则：
 （1）不能有构造方法，只能有一个实例。
 （2）不能定义任何静态成员、静态方法。
 （3）不能是public,protected,private,static。
 （4）一定是在new的后面，用其隐含实现一个接口或继承一个类。
 （5）匿名内部类为局部的，所以局部内部类的所有限制都对其生效。
 * */
public class InnerDemo {
    public static void main(String[] args) {
        Outer1 o11 = new Outer1();
        o11.run1();
        Outer1 o12 = new Outer1();
        Outer1.Inner1 i12 = o12.new Inner1();
        i12.print1();
        System.out.println("----------------------------");
        o11.run2(2);
        System.out.println("----------------------------");
        Outer1.SInner os = new Outer1.SInner();
        os.print3();
        System.out.println("----------------------------");
        o11.print4();
        System.out.println("----------------------------");
        o11.print5();
        System.out.println("----------------------------");
        o11.print6(new Isy() {
            public void study() {
                System.out.println("参数式的匿名内部类");
            }
        });
    }
}
class Outer1{
    /*     静态内部类
    * 静态的含义是该内部类可以像其他静态成员一样，没有外部类对象时，也能够访问它。
    * 静态嵌套类仅能访问外部类的静态成员和方法。
    * */
    static class SInner{
        public void print3(){
            System.out.println("静态内部类");
        }
    }
    Inner1 i11 = new Inner1();
    /*               成员内部类
     * 内部类除了可以在外部类中产生实例化对象，也可以在外部类的外部来实例化。
     * 那么，根据内部类生成的*.class文件：Outer$Inner.class
     * “$” 符号在程序运行时将替换成“.”
     * 所以内部类的访问：通过“外部类.内部类”的形式表示。
     */
    class Inner1{
        public void print1(){
            System.out.println("成员内部类");
        }
    }
    public void run1(){
        i11.print1();
    }

    /*      方法内部类
      内部类可以作为一个类的成员外，还可以把类放在方法内定义。
      注意：1、方法内部类只能在定义该内部类的方法内实例化，不可以在此方法外对其实例化。
            2、方法内部类对象不能使用该内部类所在方法的非final局部变量。
     */
    /*
    * 问题：局部内部类访问局部变量必须用final修饰，为什么?
    * 当调用这个方法时，局部变量如果没有用final修饰，他的生命周期和方法的生命周期是一样的，
     当方法被调用时会入栈，方法结束后即弹栈，这个局部变量也会消失，
    那么如果局部内部类对象还没有马上消失想用这个局部变量，显然已无法使用了，
   如果用final修饰会在类加载的时候进入常量池，
  即使方法弹栈，常量池的常量还在，也就可以继续使用了。
    * 注意：在jdk1.8中取消了在局部内部类中使用的变量必须显示的使用final修饰，
           编译器默认会为这个变量加上final
    * */
    public void run2(int i){
        class Inner2{
            public void print2(){
                System.out.println("方法内部类" + i);
            }
        }
        Inner2 i2 = new Inner2();
        i2.print2();
    }
    public void print4(){
        AnimalID cat = new AnimalID(){
            public void eat(){
                System.out.println("我是一只猫,继承式内部类");
            }
        };
        cat.eat();
    }
    public void print5(){
        Isy sy = new Isy(){
            public void study(){
                System.out.println("接口式内部类");
            }
        };
        sy.study();
    }
    public void print6(Isy sy){
        sy.study();
    }
}
abstract class AnimalID{
    public abstract void eat();
}
interface Isy{
    public void study();
}
