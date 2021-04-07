package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TypeofTriangleTest {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		assertEquals("Equiltearl",test.getype(3, 3, 3));
	}

	void test2() {
		JunitTesting test = new JunitTesting();
		assertEquals("Scalene",test.getype(3, 4, 5));
	}
	void test3() {
		JunitTesting test = new JunitTesting();
		assertEquals("Isloated",test.getype(4, 4, 5));
	}
	
	
}
