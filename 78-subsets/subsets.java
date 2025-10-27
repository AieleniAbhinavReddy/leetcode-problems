class Solution {
    private void backtrack(int start,int[] nums,List<Integer> curr,List<List<Integer>> ans){
        ans.add(new ArrayList<>(curr));
        for(int i=start;i<nums.length;i++){// append recurse delete
            curr.add(nums[i]);
            backtrack(i+1,nums,curr,ans);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(0,nums,new ArrayList<>(),ans);
        return ans;
    }
}