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
    public boolean helper(TreeNode lr,TreeNode rr){
        if(lr==null && rr==null) return true;
        if(lr==null || rr==null) return false;
        if(lr.val != rr.val) return false;
        return (helper(lr.left,rr.right) && helper(lr.right,rr.left));
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return(helper(root.left,root.right));
    }
}