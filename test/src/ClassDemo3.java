public class ClassDemo3 {
    public static void main(String[] args){
        Dog d = new Dog();
        System.out.println(d.color);
        d.bar();
    }
}
class Animal{
    String color;
    public Animal(String color){
        this.color = color;
    }
    public void bar(){
        System.out.println("旺旺");
    }
}

class Dog extends Animal{
    public Dog(){
        super("black");
    }

    @Override
    public void bar() {
        System.out.println("吃块肉");
        super.bar();
    }
}