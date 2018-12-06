public class Lambda {
    public static void main(String[] args) {
//        IEat e1 =  new EatImpl();
//        e1.eat();
//
//        IEat e2 = new IEat(){
//            @Override
//            public void eat() {
//                System.out.println("eat...banana");
//            }
//        };
//        e2.eat();

//        IEat e3 = ()->{
//            System.out.println("没有参数时使用Lambda表达式---public void eat();");
//        };
//        e3.eat();

//        IEat e4 = (name, fruit) -> {
//            System.out.println("有参数时使用Lambda表达式---"+name+" eat "+fruit);
//        };
//        e4.eat("zs","apple");

        IEat e5 = (name, fruit) -> 10;
        System.out.println("有返回值的代码块");
        e5.eat("sf","dsjf");
        IEat e6 = (final String name,String fruit)->10;
        System.out.println("参数中使用final关键字");
        e6.eat("sd","sdfs");
        e5.say();
        e5.say11111();
        IEat.sing();
    }
}

interface IEat{
    //public void eat();
    //public void eat(final String name,String fruit);
    public int eat(final String name,String fruit);
    public default void say(){
        System.out.println("ssssssssssss");
    }
    public default void say11111(){
        System.out.println("ssssssssssss");
    }
    public static void sing(){
        System.out.println("song.....");
    }
}

//class EatImpl implements IEat{
//
//    @Override
//    public void eat() {
//        System.out.println("eat...apple");
//    }
//}
