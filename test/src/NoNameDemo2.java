public class NoNameDemo2 {
    public static void main(String[] args) {
        Button b = new Button();
        b.addListener(new MouseAdapter() {
            @Override
            public void onClick() {
                System.out.println("onClick");
            }
            @Override
            public void onDbClick() {
                System.out.println("onDbClick");
            }
        });
        b.onClick();
        b.onDbClick();
    }
}
class Button{
    private MouseListener listener;
    public void addListener(MouseListener listener){
        this.listener = listener;
    }
    public void onClick(){
        listener.onClick();
    }
    public void onDbClick(){
        listener.onDbClick();
    }
}
interface MouseListener{
    public void onClick();//单击事件
    public void onDbClick();//双击事件
    //可能存在其他很多并非每个按钮都会去应用的时间，因此会造成大量的代码书写
    public void pop();//右键事件
}
//为解决上述问题，引入适配器模式
abstract class MouseAdapter implements MouseListener{
    public void pop(){
    };
}
