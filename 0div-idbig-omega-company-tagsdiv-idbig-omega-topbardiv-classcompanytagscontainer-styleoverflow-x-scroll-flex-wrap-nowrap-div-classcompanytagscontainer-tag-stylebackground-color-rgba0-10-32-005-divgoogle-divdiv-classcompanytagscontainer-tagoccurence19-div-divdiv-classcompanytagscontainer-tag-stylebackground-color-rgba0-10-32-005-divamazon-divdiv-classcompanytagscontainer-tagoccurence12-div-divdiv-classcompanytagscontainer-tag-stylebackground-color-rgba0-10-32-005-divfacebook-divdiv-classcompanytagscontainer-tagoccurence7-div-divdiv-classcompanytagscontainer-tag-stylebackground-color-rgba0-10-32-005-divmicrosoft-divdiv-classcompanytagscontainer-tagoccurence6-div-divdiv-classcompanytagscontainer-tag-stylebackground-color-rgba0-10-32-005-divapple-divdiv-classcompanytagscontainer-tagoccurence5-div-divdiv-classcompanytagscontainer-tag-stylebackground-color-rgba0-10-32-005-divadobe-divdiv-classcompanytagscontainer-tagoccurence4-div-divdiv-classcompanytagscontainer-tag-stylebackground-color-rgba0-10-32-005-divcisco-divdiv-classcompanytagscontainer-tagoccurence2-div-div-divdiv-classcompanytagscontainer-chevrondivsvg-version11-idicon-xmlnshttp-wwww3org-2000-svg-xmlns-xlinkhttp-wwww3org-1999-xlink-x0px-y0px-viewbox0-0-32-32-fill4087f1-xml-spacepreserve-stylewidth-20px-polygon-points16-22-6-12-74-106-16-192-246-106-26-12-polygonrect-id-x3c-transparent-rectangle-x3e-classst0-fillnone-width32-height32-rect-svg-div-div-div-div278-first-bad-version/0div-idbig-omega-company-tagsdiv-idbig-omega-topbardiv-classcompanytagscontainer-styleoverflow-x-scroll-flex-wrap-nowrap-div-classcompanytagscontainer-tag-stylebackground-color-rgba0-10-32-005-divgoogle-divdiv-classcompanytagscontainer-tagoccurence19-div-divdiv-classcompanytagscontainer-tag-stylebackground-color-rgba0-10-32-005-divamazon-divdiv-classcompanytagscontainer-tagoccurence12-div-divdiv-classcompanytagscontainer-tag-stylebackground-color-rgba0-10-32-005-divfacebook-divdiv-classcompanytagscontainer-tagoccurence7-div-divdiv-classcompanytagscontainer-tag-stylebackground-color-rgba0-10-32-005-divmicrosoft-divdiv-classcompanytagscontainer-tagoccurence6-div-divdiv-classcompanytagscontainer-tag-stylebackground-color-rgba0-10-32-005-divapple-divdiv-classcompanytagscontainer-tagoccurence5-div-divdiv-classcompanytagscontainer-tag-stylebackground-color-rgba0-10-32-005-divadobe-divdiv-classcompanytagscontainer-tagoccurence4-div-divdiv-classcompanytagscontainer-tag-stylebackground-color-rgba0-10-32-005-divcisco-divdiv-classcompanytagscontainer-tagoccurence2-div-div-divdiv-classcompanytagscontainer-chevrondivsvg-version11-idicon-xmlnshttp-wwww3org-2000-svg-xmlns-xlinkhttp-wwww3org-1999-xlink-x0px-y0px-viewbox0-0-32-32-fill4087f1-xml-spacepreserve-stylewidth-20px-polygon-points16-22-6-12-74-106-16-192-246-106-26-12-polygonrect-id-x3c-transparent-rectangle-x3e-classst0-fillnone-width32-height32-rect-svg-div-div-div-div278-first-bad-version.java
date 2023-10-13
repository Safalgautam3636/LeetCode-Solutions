/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    //[1,2,3,4,5]
    public int firstBadVersion(int n) {
        int first=1;
        int second=n;
        int ans=-1;
        while(first<=second){
            int mid=first+(second-first)/2;
            if(isBadVersion(mid)){
                ans=mid;
                second=mid-1;
            }
            else{
                first=mid+1;
            }
        }
        return ans;
    }
}