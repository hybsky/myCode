public class IteratorModle {
    public static void main(String[] args) {
        MyList list = new ConcreteAggregate();
        //List<String> l = new ArrayList<>();
        list.add("刘备");
        list.add("张飞");
        list.add("关羽");
        list.add("曹操");
        list.add("诸葛亮");
        //l.iterator();
        Iterator iter = list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
interface Iterator {
    boolean hasNext();
    Object next();
}
interface MyList{
    public void add(Object e);
    public Object get(int index);
    public Iterator iterator();
    public int Size();
}
class ConcreteAggregate implements MyList{
    private Object[] elements;
    private int size;
    private int index;
    public ConcreteAggregate(){
        elements = new Object[100];
    }

    @Override
    public void add(Object e) {
        elements[index++] = e;
        size++;
    }

    @Override
    public Object get(int index) {
        return elements[index];
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public int Size() {
        return size;
    }
}

class ConcreteIterator implements Iterator{
    private MyList list =  null;
    private int index;
    public ConcreteIterator(MyList list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if(index>=list.Size()){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        Object obj = list.get(index);
        index++;
        return obj;
    }
}