class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sum=nums1.length+nums2.length;
        if(sum%2==0){
            return ((double)findKth(nums1,0,nums2,0,sum/2)+(double)findKth(nums1,0,nums2,0,sum/2+1))/2;
        }
        return findKth(nums1,0,nums2,0,(sum+1)/2);
    }//因为是有序数组所以当k不等于1时，我们移动left_1和left_2标记点前后略过的数组空间内一定没有我们所需要的第k小数。
    public int findKth(int[] nums1,int left_1,int[] nums2,int left_2,int k){
        if(left_1>=nums1.length)return nums2[left_2+k-1];
        if(left_2>=nums2.length)return nums1[left_1+k-1];
        if(k==1)return Math.min(nums1[left_1],nums2[left_2]);
        int mid1=(left_1+k/2-1<nums1.length)?nums1[left_1+k/2-1]:Integer.MAX_VALUE;
        int mid2=(left_2+k/2-1<nums2.length)?nums2[left_2+k/2-1]:Integer.MAX_VALUE;
        if(mid1<=mid2){
            return findKth(nums1,left_1+k/2,nums2,left_2,k-k/2);
        }
        return findKth(nums1,left_1,nums2,left_2+k/2,k-k/2);
    }
}
