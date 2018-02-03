package Test;

import java.util.Arrays;

public class ShortestUnsortedContinuousSubarray581_v2 {

	public static int findUnsortedSubarray(int[] nums) {
       
		int nums2 []= new int[nums.length];
		 System.arraycopy(nums,0,nums2,0,nums.length);
		 Arrays.sort(nums2);
		
		 if(nums.equals(nums2))
			 return 0;
		 
		int minIndex=0;
		int maxIndex=nums.length-1;
		for(int i=0; i<nums.length;i++){
			if(nums[i]!=nums2[i]){
				minIndex=i;
				break;
			}
		}
		
		for(int i=nums.length-1; i>=0;i--){
			if(nums[i]!=nums2[i]){
				maxIndex=i;
				break;
			}
		}
		
		//System.out.println(minIndex);
		//System.out.println(maxIndex);
		return maxIndex-minIndex+1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array [] ={1,2,3,4};
		System.out.println("Length : "+findUnsortedSubarray(array));

	}

}
