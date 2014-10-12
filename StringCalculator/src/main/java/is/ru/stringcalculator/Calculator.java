package is.ru.stringcalculator;

public class Calculator
{
	public static int add(String text)
	{
		if(text.equals(""))
		{
			return 0;	
		}
		else
		{
			if(!text.contains(","))
			{
				return toInt(text);	
			}

			String[] numbers = text.split("[\\n ,]");
			int sum = 0;
			for(int i = 0; i < numbers.length; i++)
			{
				sum += toInt(numbers[i]);	
			}

			return sum;
			
		}
		
	}

	private static int toInt(String number)
	{
		return Integer.parseInt(number);
	}
}