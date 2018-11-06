public class AbstractClass {
    public static void main(String[] args) {
        //抽象类不能实例化
        //AnimalAbstract a = new AnimalAbstract();
        DogAC d = new DogAC();
        d.cry();
    }
}
abstract class AnimalAbstract{
    public AnimalAbstract(){
        System.out.println("AnimalAbstract()");
    }
    public AnimalAbstract(String s){
        System.out.println("AnimalAbstract(String s)");
    }
    //抽象方法
    abstract public void cry();
}
class DogAC extends AnimalAbstract{
    public DogAC(){
        super("skdjf");
    }
    //实现抽象方法
    public void cry(){
        System.out.println("汪汪汪");
    }
}