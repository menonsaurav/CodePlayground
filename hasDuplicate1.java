/*Given an integer array nums, return true if any value appears more than once in the array, otherwise return false. */
class hasDuplicate1{

    public static boolean hasDuplicate(int[] nums){
        int n = nums.length;
        for(int i = 0; i<n; ++i){
            for(int j = i + 1; j<n ; ++j){
                if(nums[i] == nums [j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,3};
        boolean res = hasDuplicate(nums);
        System.out.println(res); 
    }
}
