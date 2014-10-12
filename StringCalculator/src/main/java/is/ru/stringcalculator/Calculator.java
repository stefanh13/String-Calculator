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
			if(text.length() == 1)
			{
				return toInt(text);	
			}

			String regex = "";
			if(hasNewDelimiter(text))
			{
				regex = getDelimiter(text);
				text = text.substring(4, text.length());
			}
			else
			{
				regex = "[\\n ,]";
			}

			
			String[] numbers = text.split(regex);

			if(hasNegative(numbers))
			{
				return -1;
			}
			
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

	private static boolean hasNewDelimiter(String text)
	{

		return text.substring(0,2).equals("//");
	}

	private static String getDelimiter(String text)
	{
		return "[\\n " + text.substring(2,3) + "]";
	}

	private static boolean hasNegative(String[] text)
	{
		int[] negatives = new int[text.length];
		int index = 0;
		for(int i = 0; i < text.length; i++)
		{

			if(toInt(text[i]) < 0)
			{
				negatives[index] = toInt(text[i]);
				index++;
			}
		
		}

		if(index != 0)
		{
			return true;
		}
		

		return false;
	}
	
}