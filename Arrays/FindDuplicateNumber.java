class Solution {
    public int findDuplicate(int[] nums) {
        //Linked List Cycle Method
        if(nums.length==0)return 0;
        
        int fast= nums[0];//2 jumps
        int slow=nums[0];//1 jump
        
        do{
            fast=nums[nums[fast]];
            slow=nums[slow];
        }
        while(slow!=fast);//first meet
        //after this if fast starts from origin and both starts to travel simulatneously at same speed they will certainly collide at duplicate number
        fast=nums[0];
        while(slow!=fast){
            fast=nums[fast];
            slow=nums[slow];
        }
        return slow;
        
    }
}