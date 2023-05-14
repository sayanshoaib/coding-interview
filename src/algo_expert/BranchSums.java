package algo_expert;

import java.util.ArrayList;
import java.util.List;

public class BranchSums {
    // This is the class of the input root. Do not edit it.
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

//                       1   -> root node
//                     /   \
//                    2     3
//                   / \   / \
//                  4   5 6   7  -> leaf nodes

//    O(n) time | O(n) space
    public static List<Integer> branchSums(BinaryTree root) {
        ArrayList<Integer> sums = new ArrayList<>();
        calculateBranchSums(root, 0, sums);
        return sums;
    }
    private static void calculateBranchSums(BinaryTree node, int runningSum, ArrayList<Integer> sums) {
        if (node == null) {
            return;
        }

        int newRunningSum = runningSum + node.value;
        if (node.left == null && node.right == null) {
            sums.add(newRunningSum);
            return;
        }
        
        calculateBranchSums(node.left, newRunningSum, sums);
        calculateBranchSums(node.right, newRunningSum, sums);
    }
}
