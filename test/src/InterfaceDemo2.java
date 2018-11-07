public class InterfaceDemo2 {
    public static void main(String[] args) {
        //创建USB设备
        MP3 mp3 = new MP3();
        Fan fan = new Fan();
        Camera cam = new Camera();
        //创建Computer
        Computer computer = new Computer();
        //传参USB
        computer.insert(mp3);
        computer.insert(fan);
        computer.insert(cam);
    }
}
interface USB{
    public void play();
}
class MP3 implements USB{
    @Override
    public void play() {
        System.out.println("MP3");
    }
}
class Fan implements USB{
    @Override
    public void play() {
        System.out.println("Fan");
    }
}
class Camera implements USB{
    @Override
    public void play() {
        System.out.println("Camera");
    }
}
class Computer{
    public void insert(USB usb){
        System.out.println("USB设备就绪");
        usb.play();
    }
}