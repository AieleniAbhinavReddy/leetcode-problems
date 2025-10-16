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
    private static void getFreqs(TreeNode root,HashMap<Integer,Integer> map){
        if(root==null) return;
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        getFreqs(root.left,map);
        getFreqs(root.right,map);
    }
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> map=new HashMap<>();
        getFreqs(root,map);
        int fmax=0;
        ArrayList<Integer> nums=new ArrayList<>();
        for(int f:map.values()){
            fmax=Math.max(fmax,f);
        }
        for(int key:map.keySet()){
            if(map.get(key)==fmax) nums.add(key);
        }
        int[] res=new int[nums.size()];
        for(int i=0;i<res.length;i++){
            res[i]=nums.get(i);
        }
        return res;
    }
}