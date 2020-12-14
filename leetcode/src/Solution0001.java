public class Solution0001 {
    public int[] twoSum(int[] nums, int target) {
        int data[]=new int[2];
        int i,j;
        for(i=0;i<nums.length;++i){
            int a=nums[i];
            for(j=i+1;j<nums.length;++j){
                if(a+nums[j]==target){
                    data[0]=i;
                    data[1]=j;
                }
            }
        }
        return data;
    }
}
