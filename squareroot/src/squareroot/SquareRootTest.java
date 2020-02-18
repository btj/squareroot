package squareroot;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareRootTest {
	
	@Test
	void test() {
		assert SquareRoot.squareRoot(0) == 0;
		assert SquareRoot.squareRoot(9) == 3;
		assert SquareRoot.squareRoot(10) == 3;
		assert SquareRoot.squareRoot(16) == 4;
	}

}
