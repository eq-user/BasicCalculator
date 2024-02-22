package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest 
{

	
	@Test
	public void addTest() 
	{
		int firstValue = 2;
		int secondValue = 2;
		int expected = 4;
		
		int actual = CalculatorDemo.add(firstValue, secondValue);
		Assertions.assertEquals(actual, expected);
	}
	

	@Test
	public void substractTest() 
	{
		int firstValue = 2;
		int secondValue = 2;
		int expected = 0;
		
		int actual = CalculatorDemo.substract(firstValue, secondValue);
		Assertions.assertEquals(actual, expected);
	}
	

	@Test
	public void multiplyTest() 
	{
		int firstValue = 2;
		int secondValue = 2;
		int expected = 4;
		
		int actual = CalculatorDemo.multiply(firstValue, secondValue);
		Assertions.assertEquals(actual, expected);
	}
	

	@Test
	public void devideTest() 
	{
		int firstValue = 2;
		int secondValue = 2;
		int expected = 1;
		
		int actual = CalculatorDemo.devide(firstValue, secondValue);
		Assertions.assertEquals(actual, expected);
	}
	
	

}
