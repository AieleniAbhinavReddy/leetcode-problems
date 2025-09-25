class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1=version1.split("\\.");
        String[] v2=version2.split("\\.");
        System.out.println(v1.length);
        System.out.println(v2.length);
        int i=0,j=0;
        while(i<v1.length && j<v2.length){
            int n1=Integer.parseInt(v1[i++]);
            int n2=Integer.parseInt(v2[j++]);
            System.out.println(n1);
            System.out.println(n2);
            if(n1<n2) return -1;
            if(n1>n2) return 1;
        }
        while(i<v1.length){
            int n1=Integer.parseInt(v1[i++]);
            int n2=0;
            System.out.println(n1);
            System.out.println(n2);
            if(n1<n2) return -1;
            if(n1>n2) return 1;
        }
        while(j<v2.length){
            int n1=0;
            int n2=Integer.parseInt(v2[j++]);
            System.out.println(n1);
            System.out.println(n2);
            if(n1<n2) return -1;
            if(n1>n2) return 1;
        }
        return 0;
    }
}