public class InnerInterface {
    public static void main(String[] args) {
        TuHaoInnerInterface th = new TuHaoInnerInterface();
        th.findLove(new BWMInnerInterface() {
            @Override
            public void white() {
                System.out.println("white");
            }

            @Override
            public void rich() {
                System.out.println("rich");
            }
        });
    }
}
interface BWMInnerInterface{
    public void white();
    public void rich();
}
class TuHaoInnerInterface{
    public static void findLove(BWMInnerInterface bwm){
        bwm.white();
    }
}