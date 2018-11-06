public class ExtendsSuper {
    public static void main(String[] args) {
        Penguin p = new Penguin("kimy" , 20);
        p.introduction();

    }
}
class Animals {
    private String name;
    private int id;
    public Animals(String myName, int myid) {
        name = myName;
        id = myid;
    }
    public void eat(){
        System.out.println(name+"正在吃");
    }
    public void sleep(){
        System.out.println(name+"正在睡");
    }
    public void introduction() {
        System.out.println("大家好！我是"         + id + "号" + name + ".");
    }
}

class Penguin extends Animals {
    public Penguin(String myName, int myid) {
        super(myName, myid);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("吃完洗手");
    }

    public void catchFood(){
        //此处使用super和this都可以
        // 因为已继承父类方法，可使用this指向自己，也可使用super指向父类
        super.introduction();
        this.introduction();
        System.out.println("捕食");
    }
}
