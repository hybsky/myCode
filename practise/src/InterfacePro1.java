public class InterfacePro1 {
    public static void main(String[] args) {
        PC pc = new PC();
        //VideoCard vc = new VideoCard();
        pc.insert(new PCI(){
            @Override
            public void work() {
                System.out.println("VideoCard is working...");
            }
        });
    }
}
interface PCI{
    public void work();
}
//class VideoCard implements PCI{
//    @Override
//    public void work() {
//        System.out.println("VideoCard is working...");
//    }
//}
//class SoundCard implements PCI{
//    @Override
//    public void work() {
//        System.out.println("SoundCard is working...");
//    }
//}
//class VoiceCard implements PCI{
//    @Override
//    public void work() {
//        System.out.println("VoiceCard is working...");
//    }
//}
class PC{
    public static void insert(PCI pci){
        pci.work();
    }
}