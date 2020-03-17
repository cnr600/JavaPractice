package arraysAndStrings;



/*Largest Number At Least Twice of Others
In a given integer array nums, there is always exactly one largest element.

Find whether the largest element in the array is at least twice as much as every other number in the array.

If it is, return the index of the largest element, otherwise return -1.
 * 
 * 
 * 
 */
public class LargestNumberAtLeastTwiceOfOthers {
	
	public int largestNumber(int[] nums) {
		int lN=-1;
		int lastLN=-1;
		int i=-1;
		
		
		for(int n=0;n<nums.length;n ++) {
			
			if(lN<nums[n]) 
			{	
				lastLN=lN;
				lN=nums[n];
				i=n;
			}else {
				if(lastLN<nums[n]) {
					lastLN=nums[n];
				}
			}
			
			System.out.println("n: "+n+ " lN: "+lN+" lastLN: "+lastLN+" Result: "+i);
			
		}
		System.out.println("----------------------------");
		return (lastLN*2<=lN) ? i :-1;
	}

}
