
public class CalculatorMain 
{

	public static void main(String[] args)
	{
		// This is how we create an object 
		// new --> java keyword which creates an object
		Calculator calc = new Calculator();
		System.out.println(calc.add(2,6));
		
		CalculatorDif calc2 = new CalculatorDif();
		System.out.print(calc2.subtract(10,6));
	}
}
