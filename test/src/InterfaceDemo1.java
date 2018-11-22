public class InterfaceDemo1 {
    public static void main(String[] args) {
        WomenStar ws = new WomenStar();
        ws.white();
        ws.rich();
        TuHao th = new TuHao();
        th.marry(ws);
        //KereanMan km = new KereanMan();
        //th.marry(km);
    }
}
interface White{
    public abstract void white();
}
interface Rich{
    public abstract void rich();
}
//接口中方法默认为是抽象的，关键字abstract可以省略
//在一个接口中，只能定义常量、抽象方法，JDK1.8后可以定义默认的实现方法
interface Beauty{
    public default void beauty(){
        System.out.println("beautiful.....");
    }
}
//接口与接口之间可以多继承的
interface WRB extends White , Rich , Beauty{

}
class WomenStar implements WRB{
    public void white(){
        System.out.println("白");
    }
    public void rich(){
        System.out.println("富");
    }

    @Override
    public void beauty() {
        System.out.println("美");
    }
}

//class TuHao{
//    public void marry(White w){
//        w.white();
//    }
//}
class TuHao{
    public void marry(WRB wrb){
        wrb.white();
        wrb.rich();
        wrb.beauty();
    }
}
class KereanMan implements White{
    public void white(){
        System.out.println("白面小生");
    }
}