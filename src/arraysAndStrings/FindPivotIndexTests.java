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
	@Test
	void pivotIndex4() {
	    int[] num= new int[] {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,19};
		assertEquals(20,fPI.pivotIndex(num));
	}
	
	@Test
	void pivotIndex5() {
		int[] num = new int [] {-1,-1,-1,0,1,1};
		assertEquals(0, fPI.pivotIndex(num));
	}
	@Test
	void pivotIndex6() {
		int[] num = new int [] {-1};
		assertEquals(0, fPI.pivotIndex(num));
	}
	@Test
	void pivotIndex7() {
		int[] num = new int [] {-1,0};
		assertEquals(0, fPI.pivotIndex(num));
	}
	@Test
	void pivotIndex8() {
		int[] num = new int [] {-1,-2};
		assertEquals(-1, fPI.pivotIndex(num));
	}
	@Test
	void pivotIndex9() {
		int[] num = new int [] {-1,-1,0,1,1,0};
		assertEquals(5, fPI.pivotIndex(num));
	}
	@Test
	void pivotIndex10() {
		int[] num = new int [] {};
		assertEquals(-1, fPI.pivotIndex(num));
	}
}
