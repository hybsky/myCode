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
}
