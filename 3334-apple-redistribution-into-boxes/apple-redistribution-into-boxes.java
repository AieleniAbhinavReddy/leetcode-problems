class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int i=capacity.length-1,total=0,boxes=0;
        for(int a:apple) total+=a;
        while(i>=0){
            total-=capacity[i];
            boxes++;
            if(total<=0) break;
            i--;
        }
        return boxes;
    }
}