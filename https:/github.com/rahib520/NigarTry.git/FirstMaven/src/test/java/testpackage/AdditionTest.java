package testpackage;

import org.junit.Assert;
import org.junit.Test;

public class AdditionTest {

	int num1 = 5;
	int num2 = 9;

	@Test
	public void testAddAddition1() {

		Assert.assertEquals(45, num1 * num2);

	}

	@Test
	public void testAddAddition2() {

		Assert.assertEquals(44, num1 * num2);

	}

}
