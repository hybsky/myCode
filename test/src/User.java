public class User extends UserService{
    public void login(UserBean userBean) throws MyException{
    //public void login(UserBean userBean) {
        if (userBean.getName() != "admin"){
            throw new MyException("用户名错误");
        }else if (userBean.getPsw() != 12345){
            throw new MyException("密码错误");
        }else {
            System.out.println("登陆成功");
            System.out.println(userBean);
        }
    }
}
