package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class simpleTest {

	@Test
	public void test() {
		InterestCalculation test=new InterestCalculation();
		int output=test.simple(2000,2,5);
		assertEquals(200,output);
	}

}
