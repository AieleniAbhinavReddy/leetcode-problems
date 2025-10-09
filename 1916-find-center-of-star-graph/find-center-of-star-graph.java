class Solution {
    public int findCenter(int[][] edges) {
        int c=-1;
        for(int i=0;i<edges.length-1;i++){
            if(edges[i][0]==edges[i+1][0] || edges[i][0]==edges[i+1][1]) c=edges[i][0];
            else c=edges[i][1];
        }
        return c;
    }
}