/**
 * 简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例。
 * 简单工厂模式是工厂模式家族中最简单实用的模式。
 * */
public class StaticFactoryModle {
    public static void main(String[] args) {
        Product p = Factory.getProduct("Phone");
        if (p != null){
            p.work();
        }
    }
}
class Factory{
    public static Product getProduct(String data){
        if (data.equals("Phone")){
            return new Phone();
        }else if (data.equals("Computer")){
            return new Computer();
        }
        return null;
    }
}
abstract class Product{
    public abstract void work();
}
class Phone extends Product{
    public void work() {
        System.out.println("Phone is working......");
    }
}
class Computer extends Product{
    public void work() {
        System.out.println("Computer is working......");
    }
}