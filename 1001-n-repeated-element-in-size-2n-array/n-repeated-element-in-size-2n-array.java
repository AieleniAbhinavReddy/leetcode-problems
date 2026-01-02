class Solution {
    public int repeatedNTimes(int[] nums) {
        int len=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums) map.put(n,map.getOrDefault(n,0)+1);
        for(int n:map.keySet()){
            if(map.get(n)==len/2) return n;
        }
        return -1;
    }
}