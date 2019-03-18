package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class compoundTest {

	@Test
	public void test() {
		InterestCalculation test=new InterestCalculation();
		int output=test.compound(1000,2,5);
		assertEquals(210,output);
	}

}
