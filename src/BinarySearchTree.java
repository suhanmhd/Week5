import java.util.ArrayList;
import java.util.Stack;

public class BinarySearchTree {

    int count =0;
    ArrayList<Integer>list = new ArrayList<>();
    long min = Long.MAX_VALUE;

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


    public void findTheKthSmallest(){

        KthSmallestHelper( root);


    }

    public void KthSmallestHelper(Node root){
        if(root==null){
            return;
        }

         KthSmallestHelper(root.left);
         list.add(root.data);
        KthSmallestHelper(root.right);

    }



//    public void findTheKthSmallestSpace(Node root){
//        int k=2;
//
//        KthSmallestHelperSpace( root,0,k);
//
//        findTheCount(root);
//
//
//
//
//
//    }

//    public void KthSmallestHelperSpace(Node root ,int count,int K){


//        Stack<Node> stack = new Stack<>();
//        stack.push(root);
//
//            while (!stack.isEmpty()){
//
//                stack.push(root.left);
//            }
//
//            stack.push(root.right);
//


//        if(root==null){
//            return;
//        }


//
//        KthSmallestHelper(root.left,count+1 );
//        if(root.data< min ){
//            min =root.data;
//        }
//        if (count==findTheCount(root)-K){
//            return root;
//        }
//
//        KthSmallestHelper(root.right,count+1);
//
//    }





    public void findTheCount(Node root){
        if(root==null){
            return ;
        }

        findTheCount(root.left);
        count++;
        findTheCount(root.right);

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
