package arraysAndStrings;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class FindPivotIndexTests {

	private final FindPivotIndex fPI = new FindPivotIndex();

	@Test
	void pivotIndex1() {
	    int[] num= new int[] {1,7,3,6,5,6};
		assertEquals(3,fPI.pivotIndex(num));
	}
	@Test
	void pivotIndex2() {
	    int[] num= new int[] {1,2,3};
		assertEquals(-1,fPI.pivotIndex(num));
	}
	@Test
	void pivotIndex3() {
	    int[] num= new int[] {1,2};
		assertEquals(-1,fPI.pivotIndex(num));
	}
}
