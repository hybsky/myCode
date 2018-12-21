import java.util.List;
import java.util.Optional;
import java.util.Vector;

public class OptionalDemo {
    public static void main(String[] args) {
        Cat c = new Cat("1",1);
//        Cat c1 = null;
        Optional<Cat> o = Optional.ofNullable(c);
        System.out.println(getC(o));
    }

    public static Cat getC(Optional<Cat> c){

        return c.orElse(null);
    }
}
