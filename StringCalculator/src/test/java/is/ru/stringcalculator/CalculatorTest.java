
package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest
{
	public static void main(String args[])
	{
		org.junit.runner.JUnitCore.main("is.ru.stringcalculator");
	}


	@Test
	public void testEmptyString()
	{
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber()
	{
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers()
	{
		assertEquals(8, Calculator.add("1,7"));
	}

	@Test
	public void testMultipleNumbers()
	{
		String numbers = "0";
		int sum = 0;
		for(int i = 1; i < 100; i++)
		{

			assertEquals(sum, Calculator.add(numbers));
			numbers += "," + i;	
			sum += i;
		}
		
	}

	@Test
	public void testMultipleNumbersWithNewLine()
	{
		assertEquals(10, Calculator.add("1,2\n3\n4"));

	}


	@Test
	public void testAnotherDelimiter()
	{
		assertEquals(10, Calculator.add("//;\n1;2;3\n4"));

	}

	@Test
	public void testUsingAnotherDelimiter()
	{
		assertEquals(10, Calculator.add("//;\n1;2;3\n4"));

	}

	
}	
