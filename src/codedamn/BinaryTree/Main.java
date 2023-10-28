package codedamn.BinaryTree;

public class Main {
    public static void main(String[] args) {
        var root = new TreeNode(7);
        root.left = new TreeNode(1);
        root.right = new TreeNode(8);
        root.left.right = new TreeNode(3);
        root.left.right.left = new TreeNode(2);
        root.left.right.right = new TreeNode(5);
        root.right.right = new TreeNode(10);
    }
}
