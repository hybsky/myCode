import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListDemo {
    public static void main(String[] args) {
        arrayList();
        vector();
        linkedList();
    }
    public static void linkedList(){
        List<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
    public static void vector(){
        List<String> vector = new Vector<>();
        vector.add("a");
        vector.add("b");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }
    }
    public static void arrayList(){
        List<String> arrayList = new ArrayList<>();
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("ccc");
        arrayList.add("ddd");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
