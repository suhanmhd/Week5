public class Main {




        public static void main(String[] args) {

             BinarySearchTree bt = new BinarySearchTree();
             bt.insert(10);
                bt.insert(12);
                bt.insert(7);
                bt.insert(3);
                bt.insert(23);
                bt.insert(4);
                bt.inorderTraversal(bt.root);
            }


}