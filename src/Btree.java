public class Btree {

    class  Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }

    }
    Node root;

    Btree(){
        root=null;
    }


    public void insert(int key) {
        root = insertNode(root, key);
    }

    public Node insertNode(Node root,int data){

        if(root==null){
            root=new Node(data);
            return root;
        }

       if(root.data>data){
           root.left = insertNode(root.left,data);
       }
       else{
           root.right =insertNode(root.right,data);
       }
      return root;
    }


//    public void inorder(Node root){
//
//    }
public  void inorderTraversal(Node root){
    if(root==null){
        return;
    }

    inorderTraversal(root.left);
    System.out.print(root.data+" ");
    inorderTraversal(root.right);
}

public void preorderTreversal(Node root){
        if(root==null){
           return;
        }
    System.out.println(root.data+" ");
        preorderTreversal(root.left);
        preorderTreversal(root.right);
}

    public void postorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.println(root.data + " ");
    }



public  Node deleteTree(Node troot,int val){

        if(troot.data<val){
            troot.right =deleteTree(troot.right,val);
        }
        else if(troot.data>val){
            troot.left = deleteTree(troot.left,val);
        }
        else{
//            case1 leaf node
            if(troot.left==null&&troot.right==null){
                return null;
            }
//            case2: node with one child

           else if(troot.right==null){
                return troot.left;
            }
            else if(troot.left==null){
                return  troot.right;
            }
            else{
                Node IS = inorderSuccessor(root.right);
                root.data=IS.data;
                root.right = deleteTree(root.right,IS.data);



            }


        }
   return  troot;
}



public  Node inorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
}






    public int getLength(Node root) {
        if (root == null) {
            return 0;
        }
            int leftLength = getLength(root.left);
            int rightLength = getLength(root.right);

            // Add 1 to include the root node in the count
            return 1+Math.max(leftLength , rightLength);

    }


    public static void main(String[] args) {
        Btree btree = new Btree();
        btree.insert(10);
        btree.insert(12);
        btree.insert(7);


        btree.insert(3);
        btree.insert(23);
        btree.insert(4);
        btree.inorderTraversal(btree.root);
//        btree.deleteTree(btree.root, 4);
//        System.out.println();
//        btree.inorderTraversal(btree.root);
//        btree.deleteTree(btree.root, 10);
//        System.out.println();
//        btree.inorderTraversal(btree.root);
//        System.out.println();
//        btree.preorderTreversal(btree.root);
//        System.out.println();
//        btree.postorderTraversal(btree.root);
        System.out.println();
        System.out.println("Length of the tree is : "+btree.getLength(btree.root));

        int diameter=btree.diameterOfBinaryTree(btree.root);
        System.out.println("diameter of the tree is : "+diameter);
    }
}
