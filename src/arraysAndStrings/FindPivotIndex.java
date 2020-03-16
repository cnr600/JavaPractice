package arraysAndStrings;

public class FindPivotIndex {

	public int pivotIndex(int[] nums) {
		int leftSum=0, pivot=0,	rightSum=0, totalSum=0;
		if(nums.length<3) return -1;
		for(int i=0;i<nums.length;i++) {
			totalSum+=nums[i];
		}
		for(int i=2;i<nums.length;i++) {
			leftSum+=nums[i-2];
			pivot=i-1;
			rightSum=totalSum-leftSum-nums[pivot];
			System.out.println("Pivot: "+pivot+"totalSum: "+totalSum+" | leftSum: "+leftSum+" | rightSum: "+rightSum);
			if(leftSum==rightSum) return pivot;
		}
		
		return -1;
	}
	
	
}
