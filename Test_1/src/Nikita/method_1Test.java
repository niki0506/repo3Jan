package Nikita;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class method_1Test {
	@Test
	void test() {
		//fail("Not yet implemented");
	}
	@Test
	void testadd() {
		method_1 objAdd=new method_1();
		int expected=6;
		int actual=objAdd.add(3,3);
		assertEquals(expected,actual);
	}
	@Test
	void testmult() {
			method_1 objAdd=new method_1();
			int expected=9;
			int actual=objAdd.mult(3,3,1);
			assertEquals(expected,actual);
	}
	@Test
	void testdiv() {
			method_1 objAdd=new method_1();
			int expected=1;
			int actual=objAdd.div(3,3);
			assertEquals(expected,actual);
	}
}
