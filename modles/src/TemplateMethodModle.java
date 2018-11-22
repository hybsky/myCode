/**
 * 模板方法模式（Templete Method）：
 * 定义一个操作中的算法的骨架，而将一些可变部分的实现延迟到子类中。
 * 模版方法模式使得子类可以不改变一个算法的结构即可重新定义该算法的某些特定的步骤。
 *
 * */
public class TemplateMethodModle {
    public static void main(String[] args) {
        BaseManager bm = new UserManager();
        bm.action("admin","add");
    }
}
abstract class BaseManager{
    public void action(String name,String method){
        if("admin".equals(name)){
            execute(method);
        }else{
            System.out.println("没有权限做此操作");
        }
    }
    public abstract void execute(String method);
}
class UserManager extends BaseManager{
    public void execute(String method){
        if("add".equals(method)){
            System.out.println("做添加操作。。。。");
        }else if("find".equals(method)){
            System.out.println("做查询操作。。。。");
        }
    }
}
