import jdk.nashorn.internal.ir.CatchNode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {
//        hashSet1();
//        hashSet2();
//        treeSet();
        linkedHashSet();
    }
    public static void linkedHashSet(){
        Set<String> set = new LinkedHashSet<>();
        set.add("tom");
        set.add("james");
        set.add("jack");
        set.add("lose");
        set.add("lily");

        String[] cs = set.toArray(new String[]{});
        for (String c:cs) {
            System.out.println(c);
        }
    }
    public static void treeSet(){
        Set<String> ts1 = new TreeSet<>();

        ts1.add("tom");
        ts1.add("james");
        ts1.add("jack");
        ts1.add("lose");
        ts1.add("lily");

        String[] str = ts1.toArray(new String[]{});
        for (String s:str) {
            System.out.println(s);
        }


        Set<Cat> ts2 = new TreeSet<>(new CatComparator());
        Cat c1 = new Cat(1,"a",2);
        Cat c2 = new Cat(2,"b",1);
        Cat c3 = new Cat(3,"c",2);
        ts2.add(c1);
        ts2.add(c2);
        ts2.add(c3);
        Cat[] cs = ts2.toArray(new Cat[]{});
        for (Cat c:cs) {
            System.out.println(c);
        }
    }
    public static void hashSet2(){
        Set<Cat> hs2 = new HashSet<>();
        Cat c1 = new Cat(1,"a",1);
        Cat c2 = new Cat(2,"b",2);
        Cat c3 = new Cat(3,"c",3);
        hs2.add(c1);
        hs2.add(c2);
        hs2.add(c3);
        Cat[] cats = hs2.toArray(new Cat[]{});
        for (Cat c:cats) {
            System.out.println(c);
        }
    }
    public static void hashSet1(){
        Set<String> hs1 = new HashSet<>();
        hs1.add("a");
        hs1.add("b");
        hs1.add("c");
        hs1.remove("b");
        String[] strings = hs1.toArray(new String[]{});
        for (String s:strings) {
            System.out.println(s);
        }
    }
}
