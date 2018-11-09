import javax.print.Doc;

public class PolyDemo1 {
    public static void main(String[] args) {
//        DogPoly dp = new DogPoly();
//        dp.cry();
//        //多态实现：父类或者接口的引用指向或者接受自己的子类对象
//        AnimalPoly dp2 = new DogPoly();
//        dp2.cry();
//        Eatable dp4 = new DogPoly();
//        dp4.eat();
        //Object类中没有cry方法
//        Object dp3 = new Dog();
//        dp3.cry();
        //类中方法可以覆盖，但成员变量不能被覆盖
        Jing8Poly dp5 = new Jing8Poly();
        System.out.println(dp5.name);
        dp5.cry();
        DogPoly dp6 = dp5;
        System.out.println(dp6.name);
        dp6.cry();
    }
}
abstract class AnimalPoly{
    abstract void cry();
}
interface Eatable{
    public void eat();
}
class DogPoly extends AnimalPoly implements Eatable{
    public String name = "大黄";
    public void cry(){
        System.out.println("汪汪汪");
    }

    @Override
    public void eat() {
        System.out.println("eat...");
    }
}
class Jing8Poly extends DogPoly{
    public String name = "小白";
    @Override
    public void cry() {
        System.out.println("Jing8汪汪汪");
    }
}
