/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);

        return result.get(k - 1);
    }

    private void helper(TreeNode node, List<Integer> result) {
        // Base case: if the node is empty, wind down the recursion
        if (node == null) {
            return;
        }
        
        helper(node.left, result);   // 1. Traverse left subtree
        result.add(node.val);        // 2. Visit current root node
        helper(node.right, result);  // 3. Traverse right subtree
    }
}
