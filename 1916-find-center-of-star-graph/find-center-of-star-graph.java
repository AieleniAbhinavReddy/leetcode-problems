class Solution {
    public int findCenter(int[][] edges) {
        // List<List<Integer>> adj=new ArrayList<>();
        // Set<Integer> nodes=new HashSet<>();
        // for(int[] e:edges){
        //     nodes.add(e[0]);
        //     nodes.add(e[1]);
        // }
        // for(int i=1;i<=nodes.size();i++){
        //     adj.add(new ArrayList<>());
        // }
        // for(int[] e:edges){
        //     int u=e[0],v=e[1];
        //     adj.get(u-1).add(v);
        //     adj.get(v-1).add(u);
        // }
        // for(int i=1;i<=nodes.size();i++){
        //     if(adj.get(i-1).size()==nodes.size()-1) return i;
        // }
        // return -1;
        int c=-1;
        for(int i=0;i<edges.length-1;i++){
            if(edges[i][0]==edges[i+1][0] || edges[i][0]==edges[i+1][1]) c=edges[i][0];
            else c=edges[i][1];
        }
        return c;
    }
}