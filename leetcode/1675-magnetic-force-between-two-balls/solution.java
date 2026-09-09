class Solution {
    public boolean ispossible(int[] arr,int n,int mid){
        int cm=1;
        int last=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]-last>=mid){
                last=arr[i];
                cm++;
            } 
            if(cm>=n) return true;         
        }
        return false;

    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
         int n=position.length;
        int l=1,h=position[n-1]-position[0];
       
        while(l<=h){
            int mid=l+((h-l)/2);
            if(ispossible(position,m,mid)){
                l=mid+1;
            }
            else
            h=mid-1;
        }
        return h;
    }
}
