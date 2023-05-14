package algo_expert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class NodeDepths {

    public static int nodeDepths(BinaryTree root) {
        int sumOfDepths = 0;
        List<Level> stack = new ArrayList<>();
        stack.add(new Level(root, 0));
        while (stack.size() > 0) {
            Level top = stack.remove(stack.size() - 1);
            BinaryTree node = top.root;
            int depth = top.depth;
            if (node == null)
                continue;
            sumOfDepths += depth;
            stack.add(new Level(node.left, depth + 1));
            stack.add(new Level(node.right, depth + 1));
        }

        return sumOfDepths;
    }

    // O(n) time | O(h) space
    public static int nodeDepthsRecursively(BinaryTree root, int depth) {
        // Handle base case of recursion.
        if (root == null)
            return 0;

        return depth + nodeDepthsRecursively(root.left, depth + 1) + nodeDepthsRecursively(root.right, depth + 1);
    }

    static class Level {
        public BinaryTree root;
        int depth;

        public Level(BinaryTree root, int depth) {
            this.root = root;
            this.depth = depth;
        }
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
