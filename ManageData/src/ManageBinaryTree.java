public class ManageBinaryTree {
    public static void main(String[] args) {
        BinaryTreeManager bt = new BinaryTreeManager();
        bt.add(8);
        bt.add(3);
        bt.add(10);
        bt.add(1);
        bt.add(6);
        bt.add(14);
        bt.add(4);
        bt.add(7);
        bt.add(13);
        bt.print();
    }
}
class BinaryTreeManager{
    private BinaryTree root;
    public void add(int data){
        if (this.root == null){
            this.root = new BinaryTree(data);
        }else {
            //往根节点添加孩子
            this.root.addBinaryTree(data);
        }
    }
    public void print(){
        if (this.root != null){
            this.root.print();
        }
    }
    class BinaryTree{
        private int data;
        private BinaryTree left;
        private BinaryTree right;
        public BinaryTree(int data){
            this.data = data;
        }
        public void addBinaryTree(int data){
            if (this.data > data){
                if (this.left == null){
                    this.left = new BinaryTree(data);
                }else {
                    this.left.addBinaryTree(data);
                }
            }else{
                if(this.right == null){
                    this.right = new BinaryTree(data);
                }else{
                    this.right.addBinaryTree(data);
                }
            }
        }
        public void print(){
            if(this.left != null){
                this.left.print();
            }
            System.out.println(this.data);
            if(this.right != null){
                this.right.print();
            }
        }
        public String toString() {
            return "BinaryTree{" +
                    "data=" + data +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}