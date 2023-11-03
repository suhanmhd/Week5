package binarySearchTree;

public class SortedArrayToBst {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        int si = 0;
        int ei = nums.length - 1;        TreeNode root = createTree(nums, si, ei);
        return root;
    }

    public TreeNode createTree(int[] nums, int si, int ei) {
        if (si > ei) {
            return null;
        }
        int mid = (si + ei) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = createTree(nums, si, mid - 1);
        node.right = createTree(nums, mid + 1, ei);
        return node;
    }


    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5};
        SortedArrayToBst bstConverter = new SortedArrayToBst();
        SortedArrayToBst.TreeNode root = bstConverter.sortedArrayToBST(sortedArray);

        // Now you can perform operations on the binary search tree.
        // For example, you can perform in-order traversal to display the elements.
        inOrderTraversal(root);
    }

    public static void inOrderTraversal(SortedArrayToBst.TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.val + " ");
            inOrderTraversal(node.right);
        }
    }
}

