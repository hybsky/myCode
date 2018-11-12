public class NoNameDemo2 {
    public static void main(String[] args) {
        Button b = new Button();
        b.addListener(new MouseAdapter() {
            @Override
            public void onClick() {
                System.out.println("onClick");
            }
        });
        b.onClick();
        b.onDbClick();

        new Button().addListener(new MouseAdapter() {
            @Override
            public void onClick() {
                System.out.println("匿名对象单击");
            }
            @Override
            public void onDbClick() {
                System.out.println("双击匿名对象");
            }
        }).onClick().onDbClick();

    }
}
class Button{
    private MouseListener listener;
    public Button addListener(MouseListener listener){
        this.listener = listener;
        //主函数中匿名对象.onClick(),对象返回的是void，没有返回值，
        // 所以改成return this,返回按钮
        return this;
    }
    public Button onClick(){
        listener.onClick();
        return this;
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
    public void onDbClick(){
    };
    public void pop(){
    };
}
