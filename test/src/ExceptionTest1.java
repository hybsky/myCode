/**
 *  自定义异常
 *  1. 继承 Throwable
 *  2. 继承 Exception
 *  3. 继承 RunTimeException
 *
 * */
public class ExceptionTest1 {
    public static void main(String[] args) {
        User u1 = new User();
        UserBean ub = new UserBean();
        ub.setName("admin");
        ub.setPsw(12345);
        try {
            u1.login(ub);
        }catch (MyException e){
            System.out.println("用户名或密码错误");
        }

    }
}
