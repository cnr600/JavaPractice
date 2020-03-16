package arraysAndStrings;

public class FindPivotIndex {

	public int pivotIndex(int[] nums) {
		int leftSum=0, pivot=0,	rightSum=0, totalSum=0;
		if(nums.length==0) return -1;
		if(nums.length==1) return 0;
	
		for(int i=0;i<nums.length;i++) {
			totalSum+=nums[i];
		}
	
		for(int i=0;i<nums.length;i++) {
			leftSum= (i>0) ? (leftSum+nums[i-1]):0;
			pivot=i;
			rightSum=(i!=nums.length-1) ? (totalSum-leftSum-nums[pivot]):0;
			System.out.println("Pivot: "+pivot+"totalSum: "+totalSum+" | leftSum: "+leftSum+" | rightSum: "+rightSum);
			if(leftSum==rightSum) return pivot;
		}
		
		return -1;
	}
	
	
}
