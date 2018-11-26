/**
 * 代理模式（Proxy）：为其他对象提供一种代理以控制对这个对象的访问。
 * 代理模式说白了就是“真实对象”的代表，
 *    在访问对象时引入一定程度的间接性，因为这种间接性可以附加多种用途。
 * */
public class ProxyModle {
    public static void main(String[] args) {
        IShopping is = new UserShop();
        Proxy p = new Proxy(is);
        p.shop();
    }
}
class Proxy implements IShopping{
    public IShopping is;//被代理的对象
    public Proxy(IShopping is){
        this.is = is;
    }
    public void shop() {
        long startTime = System.currentTimeMillis();
        is.shop();
        long endTime = System.currentTimeMillis();
        System.out.println("一共花费时间为："+(endTime - startTime));
    }
}
interface IShopping{
    public void shop();
}
class UserShop implements IShopping{
    public void shop() {
        for (int i = 0; i < 100; i++) {
            System.out.println("shopping......");
        }
    }
}