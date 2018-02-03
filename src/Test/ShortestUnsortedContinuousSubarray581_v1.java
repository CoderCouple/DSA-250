package Test;

public class ShortestUnsortedContinuousSubarray581_v1 {

	public static int findUnsortedSubarray(int[] nums) {
        if(nums.length<2)
        	return 0;
        
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        //Find the min element
        for(int i=0;i<nums.length;i++){
        	if(nums[i]<min)
        		min=nums[i];
        }
        
        //Find the max element
        for(int i=0;i<nums.length;i++){
        	if(nums[i]>max)
        		max=nums[i];
        }
        
        //If we have to sort the entire array
        if(nums[0]!=min && nums[nums.length-1]!=max)
        	return nums.length;
        
        
        //Find the min break in the sequence
        int minBreakIndex=0;
        int maxBreakIndex=nums.length-1;
        for(int i=1;i<nums.length;i++){
        	if(nums[i-1]>nums[i]){
        		minBreakIndex=i;
        	    break;}
        	
        }
        
        
        //Find the max break in the sequence
        for(int i=nums.length-1;i>0;i--){
        	if(nums[i-1]>nums[i]){
        		maxBreakIndex=i-1;
        	    break;
        	    }
        }
        
        
        if(minBreakIndex==0 && maxBreakIndex==nums.length-1)
        	return 0;
        
        int minInRange=Integer.MAX_VALUE;
        int maxInRange=Integer.MIN_VALUE;
        //Find the min element
        for(int i=minBreakIndex;i<=maxBreakIndex;i++){
        	if(nums[i]<=minInRange)
        		minInRange=nums[i];
        }
        
        //Find the max element
        for(int i=minBreakIndex;i<=maxBreakIndex;i++){
        	if(nums[i]>=maxInRange)
        		maxInRange=nums[i];
        }
        
      //Find the min break in the sequence
        int minIndex=0;
        int maxIndex=nums.length-1;
        for(int i=0;i<nums.length;i++){
        	if(nums[i]>minInRange){
        		minIndex=i;
        		break;}
        }
        
        
        //Find the max break in the sequence
        for(int i=nums.length-1;i>0;i--){
        	if(maxInRange>nums[i]){
        		maxIndex=i;
        		break;}
        }
        
		return maxIndex-minIndex+1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int array [] ={2,6,4,8,10,9,15};
//		int array [] ={2,6,4,8,10,9,15};
//		int array [] ={2,6,4,8,10,9,15};
//		int array [] ={2,6,4,8,10,9,15};
//		int array [] ={2,6,4,8,10,9,15};
		int array [] ={1,3,2,4,5};
		System.out.println("Length : "+findUnsortedSubarray(array));

	}

}
