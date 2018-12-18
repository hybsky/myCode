import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConsumerFunctionSupplier {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("aaa");
        v.add("bbb");
        v.add("ccc");
        v.add("ddd");
        foreach(v);
        System.out.println(upp("aaa", (String s) -> s.toUpperCase()));
        List<Integer> l = getRandom(10,()->(int)Math.random()*1000);
        for (Integer i:l) {
            System.out.println(i);
        }
    }
    public static void foreach(Vector<String> v){
        Consumer<String> c = ((String s)->{
            System.out.println(s);
        });
        v.forEach(c);
    }
    public static String upp(String value, Function<String,String> f){
        return f.apply(value);
    }
    public static List<Integer> getRandom(int num, Supplier<Integer> s){
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            l.add(s.get());
        }
        return l;
    }
}
