public class ThisSuper {
    public static void main(String[] args) {
        AnimalTest a = new AnimalTest();
        a.eat();
        Dogs d = new Dogs();
        d.eatTest();
    }
}
class AnimalTest {
    void eat() {
        System.out.println("animal : eat");
    }
}

class Dogs extends AnimalTest {
    void eat() {
        System.out.println("dog : eat");
    }
    void eatTest() {
        this.eat();   // this 调用自己的方法
        super.eat();  // super 调用父类方法
    }
}
