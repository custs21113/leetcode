//1. 两数之和
class Solution {
    public int[] twoSum(int[] nums, int target) {//使用哈希查找降低时间复杂度
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    //暴力解法
    /*
    public int[] twoSum(int[] nums, int target) {
      int[] list=new int[2];
      for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
          if((nums[i]+nums[j])==target){
            list[0]=i;
            list[1]=j;
            break;
            }
          }
        }
        if(list==null)throw new IllegalArgumentException("No two sum solution");
        return list;
    }
    */
}
