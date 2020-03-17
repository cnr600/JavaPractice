package arraysAndStrings;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class LargestNumberAtLeastTwiceOfOthersTests {
	
	private LargestNumberAtLeastTwiceOfOthers lN= new LargestNumberAtLeastTwiceOfOthers();

	@Test void largerNumber01(){
		
		int[] num = {3,6,1,0};
		assertEquals(1,lN.largestNumber(num));				
	}
	@Test void largerNumber02(){
		int[] num = {3};
		assertEquals(0,lN.largestNumber(num));				
	}
	@Test void largerNumber03(){
		int[] num = {1,2,3,4,5,10};
		assertEquals(5,lN.largestNumber(num));				
	}
	@Test void largerNumber04(){
		int[] num = {1,0};
		assertEquals(0,lN.largestNumber(num));				
	}
}
