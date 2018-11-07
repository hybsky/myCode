public class ExtendsInterface {
    public static void main(String[] args) {
        Jing8 j8 = new Jing8();
        j8.cry();
        Eater e = new Eater();
        RichMan rm = new RichMan();
        e.eat(j8);
        rm.buy(j8);
    }
}
abstract class Animal{
    abstract public void cry();
}
class Dog extends Animal{
    public void cry(){
        System.out.println("Dog汪汪汪");
    }
}
class Jing8 extends Dog implements Eatable , Pet{
//    @Override
//    public void cry() {
//        //super.cry();
//        System.out.println("Jing8.cry()");
//    }

    @Override
    public void eat() {
        System.out.println("Jing8被吃");
    }

    @Override
    public void buy() {
        System.out.println("Jing8被带回家");
    }
}
interface Eatable{
    public void eat();
}
interface Pet{
    public void buy();
}
class RichMan{
    public void buy(Pet pet){
        System.out.println("好萌");
        pet.buy();
    }
}
class Eater{
    public void eat(Eatable eat){
        System.out.println("食物就绪");
        eat.eat();
    }
}