package ca.comit.java;

public class Calculator {

	private int number1;
	private int number2;
	
	Calculator()
	{
		number1 = 3;
		number2 = 3;
	}
	
	Calculator(int number1, int number2)
	{
		this.number1 = number1;
		this.number2 = number2;
	}
	
	/*
	 * public void addNumbers() { System.out.println("Addition of " + number1 +
	 * " and " + number2 + " = " + (number1 + number2)); }
	 */
	
	public int addNumbers()
	{
		int result = number1 + number2;
		return result;
	}
	

}
