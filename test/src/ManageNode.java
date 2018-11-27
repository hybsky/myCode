public class ManageNode {
    public static void main(String[] args) {
        NodeManager nm = new NodeManager();
        nm.add(5);
        nm.add(4);
        nm.add(3);
        nm.add(2);
        nm.add(1);
        nm.findAll();
        System.out.println(nm.find(3));
        nm.del(1);
        nm.findAll();
        nm.add(1);
        nm.findAll();
        nm.insert(3,999);
        nm.findAll();
        nm.update(4,888);
        nm.findAll();
    }
}
class NodeManager{
    private Node root;
    private int count;
    public void add(int data){
        if (this.root == null){
            this.root = new Node(data);
        }else {
            this.root.addNode(data);
        }
    }
    public void insert(int index,int data){
        count = 0;
        if (index == count){
            Node nNode = new Node(data);
            nNode.next = this.root;
            this.root = nNode;
        }else {
            this.root.insertNode(index,data);
        }
    }
    public void update(int oldVal,int newVal){
        if (this.root != null){
            if (this.root.data == oldVal){
                this.root.data = newVal;
            }else {
                this.root.updateNode(oldVal,newVal);
            }
        }
    }
    public void del(int data){
        if (this.root != null){
            if (this.root.data == data){
                this.root = this.root.next;
            }else {
                this.root.delNode(data);
            }
        }
    }
    public Node find(int data) {
        if(this.root.data == data){
            return this.root;
        }else{
            return this.root.findNode(data);
        }
    }
    public void findAll(){
        if (this.root != null){
            System.out.print(this.root.data + "-->");
            this.root.findAll();
            System.out.println();
        }
    }
    class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
        }
        public void addNode(int data){
            if (this.next == null){
                this.next = new Node(data);
            }else {
                this.next.addNode(data);
            }
        }
        public void insertNode(int index,int data){
            count++;
            if (this.next != null){
                if (index == count){
                    Node n = new Node(data);
                    n.next = this.next;
                    this.next = n;
                }else {
                    this.next.insertNode(index,data);
                }
            }else {
                this.next = new Node(data);
            }
        }
        public void updateNode(int oldVal,int newVal){
            if (this.next != null){
                Node n = find(oldVal);
                n.data = newVal;
            }else {
                this.next.updateNode(oldVal,newVal);
            }
        }
        public void delNode(int data){
            if (this.next != null){
                if (this.next.data == data){
                    this.next = this.next.next;
                }else {
                    this.next.delNode(data);
                }
            }
        }
        public Node findNode(int data){
            if (this.next != null){
                if (this.next.data == data){
                    return this.next;
                }else {
                    return this.next.findNode(data);
                }
            }
            return null;
        }
        public void findAll(){
            if (this.next != null){
                System.out.print(this.next.data + "-->");
                this.next.findAll();
            }
        }
        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
        public String toString(){
            return "节点"+data;
        }
    }
}