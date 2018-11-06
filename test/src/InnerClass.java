public class InnerClass {
    public static void main(String[] args) {
        //Benz b = new Benz();
        //b.run("001");
        //创建内部类对象，在下方书写内部类时加上static
        Benz.Engine e = new Benz.Engine();
        e.fire("002");
    }
}

//内部类在成员变量位置上，编译生成class文件名为:外部类名$内部类名
class Benz{
    String color;
    int lires;
    public void run(){
        Engine e = new Engine();
        e.fire("001");
        System.out.println("run");
    }
//    class Engine{
//        public void fire(String key){
//            System.out.println(key + "is ready");
//            System.out.println("fire");
//        }
//    }
    static class Engine{
        public void fire(String key){
            System.out.println(key + "is ready");
            System.out.println("fire");
        }
    }
}

//内部类在成员函数（方法）内定义时，编译生成类名:Benz$1Engine.class
//class Benz{
//    String color;
//    //java8不要求对局部变量使用final进行修饰
//    final int lires = 4;
//    public void run(String key){
//        class Engine{
//            public void fire(){
//                //内部类访问局部变量时，不能为局部变量重新赋值
//                //lires = 8;
//                System.out.println(key + "is ready");
//                System.out.println("fire");
//            }
//        }
//        Engine e = new Engine();
//        e.fire();
//        System.out.println("run");
//    }


//}