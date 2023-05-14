package algo_expert;

public class FindClosestValueInBST {
    public static void main(String[] args) {
        BST bst = new BST(5);
        findClosestValueInBst(bst, 8);
    }

    public static int findClosestValueInBst(BST tree, int target) {
        int closestValue = 0;
        int absDiff = Integer.MAX_VALUE;

        boolean flag = true;
        while (flag) {
            int currentDiff = Math.abs(tree.value - target);
            if (currentDiff < absDiff) {
                absDiff = currentDiff;
                closestValue = tree.value;
            }

            if (tree.value > target) {
                if (tree.left != null) {
                    tree = tree.left;
                } else {
                    flag = false;
                }
            }

            if (tree.value < target) {
                if (tree.right != null) {
                    tree = tree.right;
                } else {
                    flag = false;
                }
            }

            if (tree.value == target) {
                return tree.value;
            }

        }
        return closestValue;
    }

    // Passed All test cases
    public static int findClosestValueInBst2(BST tree, int target) {
        int closestValue = 0;
        int absDiff = Integer.MAX_VALUE;

        while (tree != null) {
            int currentDiff = Math.abs(tree.value - target);

            if (currentDiff < absDiff) {
                absDiff = currentDiff;
                closestValue = tree.value;
            }

            if (target == tree.value) {
                return tree.value;
            } else if (target < tree.value) {
                tree = tree.left;
            } else {
                tree = tree.right;
            }
        }

        return closestValue;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
