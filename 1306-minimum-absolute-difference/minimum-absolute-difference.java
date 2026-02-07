class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res=new ArrayList<>();
        int mind=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int d=Math.abs(arr[i]-arr[i+1]);
            mind=Math.min(d,mind);
        }
        for(int i=0;i<arr.length-1;i++){
            int d=Math.abs(arr[i]-arr[i+1]);
            if(d==mind){
                List<Integer> temp=new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[i+1]);
                res.add(temp);
            }
        }
        return res;
    }
}