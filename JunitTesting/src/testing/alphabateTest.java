package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class alphabateTest {

	@Test
	void test() {
		JunitTesting alptest = new JunitTesting();
		int output = alptest.count("HaAss");
		assertEquals(2,output);
		// This is Pass case becz in alpbates we just passed one small a and one big A
		
	}

}
