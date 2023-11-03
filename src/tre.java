public class tre {

    class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }

    private  Node root=null;

    public void insert(int data){
        root =insertHelper(root,data);
    }

    public Node insertHelper(Node root, int data){

        if(root==null){
            root = new Node(data);
            return root;
        }

        if(root.data<data){
            root.right = insertHelper(root.right,data);

        }
        else{
            root.left = insertHelper(root.left,data);
        }
        return root;


    }

    public  void inorderTraversal(Node root){
        if(root==null){
            return;

        }

        inorderTraversal(root.left);
        System.out.print(root.data+" ");
        inorderTraversal(root.right);

    }

    public  void postOrderTraversal(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
    }

    public  Node remove(Node root,int data){

        if(root.data<data){
            root.right = remove(root.right,data);
        }
        else if(root.data>data){
            root.left = remove(root.left,data);
        }
        else {
            if(root.left==null&&root.right==null){
                return null;
            }
            else if(root.right==null){
                return root.left;
            }
            else if(root.left==null){
                return  root.right;
            }

            Node Is = inoderSuccessor(root.right);
            root.data = Is.data;
           root.right= remove(root.right, Is.data);
        }

       return root;
    }
    public  Node inoderSuccessor(Node root){
        while (root.left!=null){
            root=root.left;
        }
        return  root;
    }
    public int height() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null) {
            return -1;
        } else {
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);
            return 1 + Math.max(leftHeight, rightHeight);
        }
    }
    public static void main(String[] args) {
        tre obj = new tre();

        obj.insert(10);
        obj.insert(1);
        obj.insert(11);
//        obj.remove(obj.root, 10);
        obj.inorderTraversal(obj.root);
        System.out.println(obj.height());
//        obj.postOrderTraversal(obj.root);
    }



}
