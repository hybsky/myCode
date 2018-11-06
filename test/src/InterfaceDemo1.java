public class InterfaceDemo1 {
    public static void main(String[] args) {
        WomenStar ws = new WomenStar();
        ws.white();
        ws.rich();
        TuHao th = new TuHao();
        th.marry(ws);
        KereanMan km = new KereanMan();
        th.marry(km);
    }
}
interface White{
    public abstract void white();
}
interface Rich{
    public abstract void rich();
}

class WomenStar implements White,Rich{
    public void white(){
        System.out.println("白");
    }
    public void rich(){
        System.out.println("富");
    }
}

class TuHao{
    public void marry(White w){
        w.white();
    }
}

class KereanMan implements White{
    public void white(){
        System.out.println("白面小生");
    }
}