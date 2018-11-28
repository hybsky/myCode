public class UserBean {
    private String name;
    private int psw;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPsw() {
        return psw;
    }

    public void setPsw(int psw) {
        this.psw = psw;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "name='" + name + '\'' +
                ", psw=" + psw +
                '}';
    }
}
