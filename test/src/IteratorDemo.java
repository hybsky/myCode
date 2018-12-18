import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import java.util.function.Consumer;

public class IteratorDemo {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("aaa");
        v.add("bbb");
        v.add("ccc");
        v.add("ddd");
//        iterator(v);
//        enumeration(v);
//        foreach(v);
        foreach1(v);
    }
    public static void foreach1(Collection<String> c){
//        Consumer<String> cc = ((String str)->{
//            System.out.println(str);
//        });
//        Consumer<String> ccc = (String str)->{
//            System.out.println(str);
//        };
//        c.forEach(ccc);

//        c.forEach((String s)->{
//            System.out.println(s);
//        });

        c.forEach(str->System.out.println(str));

//        c.forEach(System.out::println);

    }
    public static void foreach(Collection<String> c){
        for (String s:c) {
            System.out.println(s);
        }
    }
    public static void enumeration(Vector<String> v){
        Enumeration<String> e = v.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
    public static void iterator(Collection<String> c){
        Iterator<String> i = c.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
