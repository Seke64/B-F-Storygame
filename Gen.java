import java.text.DecimalFormat;//DCLR: DecimalFormat decfmt = new DecimalFormat("0.####"); USE: decfmt.format(num)
import java.text.NumberFormat;//[MONEY] DCLR: NumberFormat moneyfmt = NumberFormat.getCurrencyInstance(); USE: moneyfmt.format(dollars);
import java.util.Random;//DCLR: Random gen = new Random(); USE: num = gen.nextInt(range2 - range1 + 1) + range1;

public class Gen
{
	private static Random gen = new Random();
	
	public static boolean randPercent(int num)
	{
		return randNum(1, 100) <= num;
	}

	public static char randChar()
	{
		int out = gen.nextInt(255-32+1)+32;

		return (char)out;
	}

	public static char randChar(int num1, int num2)
	{
		int other;

		if (num1 > num2)
		{
			other = num1;
			num1 = num2;
			num2 = other;
		}

		if (num1 > 255 || num1 < 32)
		{
			num1 = 32;
		}

		if (num2 > 255 || num2 < 32)
		{
			num2 = 255;
		}

		int out = gen.nextInt(num2-num1+1)+num1;

		return (char)out;
	}

	public static char randChar(char char1, char char2)
	{
		int num1 = (int)char1;
		int num2 = (int)char2;
		int other;

		if (num1 > num2)
		{
			other = num1;
			num1 = num2;
			num2 = other;
		}

		if (num1 > 255 || num1 < 32)
		{
			num1 = 32;
		}

		if (num2 > 255 || num2 < 32)
		{
			num2 = 255;
		}

		int out = gen.nextInt(num2-num1+1)+num1;

		return (char)out;
	}

	public static int randNum()
	{
		int out = gen.nextInt(9-0+1)+0;

		return out;
	}

	public static int randNum(int num1, int num2)
	{
		int other;

		if (num1 > num2)
		{
			other = num1;
			num1 = num2;
			num2 = other;
		}

		int out = gen.nextInt(num2-num1+1)+num1;

		return out;
	}

	public static char randUpperCase()
	{
		int out = gen.nextInt(90-65+1)+65;

		return (char)out;
	}

	public static char randUpperCase(char char1, char char2)
	{
		int num1 = (int)char1;
		int num2 = (int)char2;
		int other;

		if (num1 > num2)
		{
			other = num1;
			num1 = num2;
			num2 = other;
		}

		if (num1 > 90 || num1 < 65)
		{
			num1 = 65;
		}

		if (num2 > 90 || num2 < 65)
		{
			num2 = 90;
		}

		int out = gen.nextInt(num2-num1+1)+num1;

		return (char)out;
	}

	public static char randLowerCase()
	{
		int out = gen.nextInt(122-97+1)+97;

		return (char)out;
	}

	public static char randLowerCase(char char1, char char2)
	{
		int num1 = (int)char1;
		int num2 = (int)char2;
		int other;

		if (num1 > num2)
		{
			other = num1;
			num1 = num2;
			num2 = other;
		}

		if (num1 > 122 || num1 < 97)
		{
			num1 = 97;
		}

		if (num2 > 122 || num2 < 97)
		{
			num2 = 122;
		}

		int out = gen.nextInt(num2-num1+1)+num1;

		return (char)out;
	}
	
	public static char randLetter()
	{
		int i = randNum(0,1);
		char out;
				
		if (i == 0)
		{
			out = randLowerCase();
		}
		
		else
		{
			out = randUpperCase();
		}
		
		return out;
	}

	public static boolean randBoolean()
	{
		boolean out = false;
		int num = gen.nextInt(1-0+1)+0;

		if (num == 1)
		{
			out = true;
		}

		return out;
	}
	
	public static boolean isInt(String str)
	{
		try 
	    { 
	        Integer.parseInt(str); 
	    } 
		
		catch(NumberFormatException e) 
	    { 
	        return false; 
	    }
	    
	    return true;
	}
	
	public static boolean isLetter(String str)
	{
		return true;
	}
}
