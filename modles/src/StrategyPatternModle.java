/**
 * 策略模式，定义了一系列的算法，将每一种算法封装起来并可以相互替换使用，
 *    它让算法独立于使用它的客户应用而独立变化。
 *
 * OO设计原则：
 * 1、面向接口编程（面向抽象编程）
 * 2、封装变化
 * 3、多用组合，少用继承
 *
 * */

public class StrategyPatternModle {
    public static void main(String[] args) {
        ISave is = new NetSave();
       // BaseService ss = new StuduentServise(is);
        //ss.save("javacode");
        BaseService ss = new StudentService();
        ss.setIsave(is);
        ss.save("javacode");
        //ISave is2 = new FileSave();
        //BaseService us = new UserService(is2);
        //us.save("javacode");
    }
}
interface ISave{
    public void save(String data);
}
class FileSave implements ISave{
    public void save(String data) {
        System.out.println("File---" + data + "---保存到文件中");
    }
}
class NetSave implements ISave{
    public void save(String data) {
        System.out.println("Net---" + data + "---保存到网络中");
    }
}
abstract class BaseService{
    public ISave isave;
//    public BaseService(ISave isave){
//        this.isave = isave;
//    }
    public void setIsave(ISave isave){
        this.isave = isave;
    }
    public void save(String data){
        isave.save(data);
    }
}
//class StuduentServise extends BaseService{
//    public StuduentServise(ISave isave){
//        super(isave);
//    }
//}
//class UserService extends BaseService{
//    public UserService(ISave isave){
//        super(isave);
//    }
//}

class UserService extends BaseService{

}

class StudentService extends BaseService{

}