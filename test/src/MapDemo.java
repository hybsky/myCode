import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        hashMap();
        hashtable();
        linkedhashmap();
        treeMap();
    }
    public static void treeMap() {
        Map<Integer, String> map = new TreeMap<>();
        map.put(2, "tom2");
        map.put(1, "tom");
        map.put(4, "tom4");
        map.put(3, "tom3");
        map.forEach((k,v)->{
            System.out.println(k +"->"+v);
        });

    }
    public static void linkedhashmap() {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "tom");
        map.put(2, "tom2");
        map.put(3, "tom3");
        map.put(4, "tom4");
        map.forEach((k,v)->{
            System.out.println(k +"->"+v);
        });

    }

    public static void hashtable() {
        Map<Integer, String> map = new Hashtable<>();
        map.put(1, "tom");
        map.put(2, "tom2");
        map.put(3, "tom3");
        map.put(4, "tom4");
        System.out.println(map.get(3));
    }

    public static void hashMap(){
        Map<Integer,String> hm = new HashMap<>();
        hm.put(1,"tom");
        hm.put(2,"tom2");
        hm.put(3,"tom3");
        hm.put(4,"tom4");
        System.out.println(hm.get(3));

        //获取key value 对
        Set<Map.Entry<Integer,String>> entrySet = hm.entrySet();
        for (Map.Entry e:entrySet) {
            System.out.println(e.getKey() + "->" +e.getValue());
        }

        //获取key
        Set<Integer> set = hm.keySet();
        set.forEach(System.out::println);
        //获取value
        Collection<String> values = hm.values();
        values.forEach(System.out::println);

        hm.forEach((k,v)-> System.out.println(k + "->" + v));
    }
}
