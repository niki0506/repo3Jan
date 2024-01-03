import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class mathod_1Test {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@Test
	void testadd() {
		mathod_1 objAdd=new mathod_1();
		int expected=6;
		int actual=objAdd.add(3,3);
		assertEquals(expected, actual);
	}
	
	@Test
	void testmult() {
		mathod_1 objmult=new mathod_1();
		int expected=9;
		int actual=objmult.mult(3,3,1);
		assertEquals(expected, actual);
	}
	
	@Test
	void testdiv() {
		mathod_1 objdiv=new mathod_1();
		int expected=3;
		int actual=objdiv.div(9,3);
		assertEquals(expected, actual);
	}

}
