class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            if(map.containsKey(n)) return n;
            map.put(n,n);
        }
        return -1;
    }
}