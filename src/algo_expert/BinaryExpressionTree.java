package algo_expert;

public class BinaryExpressionTree {
    public static void main(String[] args) {

    }

    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public int evaluateExpressionTree(BinaryTree tree) {
        return inOrderTrav(tree);
    }

    private boolean isLeaf(BinaryTree tree) {
        return tree.left != null && tree.right != null;
    }
    private int inOrderTrav(BinaryTree node) {
        if (isLeaf(node))
            return node.value;

        var left = inOrderTrav(node.left);
        var right = inOrderTrav(node.right);

        if (node.value == -1)
            return left + right;
        if (node.value == -2)
            return left - right;
        if (node.value == -3)
            return left / right;
        if (node.value == -4)
            return left * right;

        return 0;
    }
}
