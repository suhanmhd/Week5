package binarySearchTree;


import java.util.HashSet;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class TwoSumBinaryTree {
    HashSet<Integer> set = new HashSet<>();

    public boolean findTarget(TreeNode root, int k) {
        return inorder(root, k);
    }

    public boolean inorder(TreeNode root, int k) {
        if (root == null) {
            return false;
        }

        if (set.contains(k - root.val)) {
            return true;
        }
        set.add(root.val);
//        boolean a=inorder(root.left, k);
//        boolean b=inorder(root.right, k);
        return inorder(root.left, k) || inorder(root.right, k);
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        // Create an instance of the Solution class
        TwoSumBinaryTree solution = new TwoSumBinaryTree();

        // Test with a target sum
        int targetSum = 9;
        boolean result = solution.findTarget(root, targetSum);

        // Display the result
        if (result) {
            System.out.println("A pair of nodes with values that add up to " + targetSum + " was found.");
        } else {
            System.out.println("No pair of nodes with values that add up to " + targetSum + " was found.");
        }
    }
}
