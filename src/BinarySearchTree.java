public class BinarySearchTree {

    class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }

    Node root;

    BinarySearchTree(){
        root=null;
    }

    public void insert(int data){

        if(root==null){
            root= new Node(data);
        }
        else{
            Node current = root;
            Node parent = null;

            while (current!=null){
                parent=current;

                if(data<current.data){
                    current = current.left;
                }
                else if(data>current.data){
                    current = current.right;
                }
                else {
                    return;
                }

            }
            if(data<parent.data){
                parent.left = new Node(data);
            }
            else{
                parent.right = new Node(data);
            }


        }

    }

    public  void inorderTraversal(Node root){
        if(root==null){
            return;
        }

        inorderTraversal(root.left);
        System.out.print(root.data+" ");
        inorderTraversal(root.right);
    }


}
