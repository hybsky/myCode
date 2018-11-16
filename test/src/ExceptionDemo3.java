public class ExceptionDemo3 {
//    public static void main(String[] args) throws AgeSmallException, AgeBigException{
//        Person p = new Person();
//        p.setAgeException(-100);
//        System.out.println("OK");
//    }
    public static void main(String[] args) {
        Person p = new Person();
        try {
            p.setAgeException(-100);
        }catch (AgeSmallException e){
            System.out.println("AgeSmallException");
        }catch (AgeBigException e){
            System.out.println("AgeBigException");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("OK");
    }
}
//自定义异常
class Person{
    private int age;
    public int getAgeException(){
        return age;
    }
    //必须对AgeSmallException, AgeBigException进行捕获或者声明以便抛出，使用throws
    public void setAgeException(int age) throws AgeSmallException, AgeBigException{
        if (age < 0){
            throw new AgeSmallException("年龄过小");
        }else if (age > 100){
            throw new AgeBigException("年龄过大");
        }
    }
}
//自定义异常
class AgeSmallException extends Exception{
    public AgeSmallException(){
    }
    public AgeSmallException(String msg){
        super(msg);
    }
}
class AgeBigException extends Exception{
    public AgeBigException(){
    }
    public AgeBigException(String msg){
        super(msg);
    }
}