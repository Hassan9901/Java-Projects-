package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class squaretest {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		int output = test.square(5);
		assertEquals(25,output);
		int output2 = test.square(6);
		assertEquals(36,output2);
	}
       // Both test are passed beacuse 5x5 is 25
	  // and 6x6 is 36 
}
