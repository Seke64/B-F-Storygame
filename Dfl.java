public class Dfl
{
	public static void newLine()
	{
		System.out.println();
	}

	public static void newLine(int num)
	{
		for (int i = 0; i <= num; i++)
			System.out.println();
	}

	public static void out(String str)
	{
		System.out.println(str);
	}

	public static void line(String str)
	{
		System.out.print(str);
	}

	public static void out(String[] str)
	{
		System.out.print("[\"");

		for (int i = 0; i < str.length; i++)
		{
			System.out.print(str[i] + "\",\"");
		}

		System.out.print("\b\b] \n");
	}

	public static void out(String[][] str)
	{
		System.out.print("[");

		for (int i = 0; i < str.length; i++)
		{
			System.out.print("[\"");

			for (int j = 0; j < str[i].length; j++)
			{
				System.out.print(str[i][j] + "\",\"");
			}

			System.out.print("\b\b],");
		}

		System.out.print("\b] \n");
	}
	
	public static void outMultiline(String[][] str)
	{
		System.out.print("[[\"");

		for (int i = 0; i < str.length; i++)
		{
			if (i != 0)
				System.out.print("[\"");

			for (int j = 0; j < str[i].length; j++)
			{
				System.out.print(str[i][j] + "\",\"");
			}

			System.out.print("\b\b]\n");
		}

		System.out.print("\b] \n");
	}

	public static void out(int str)
	{
		System.out.println(str);
	}

	public static void line(int str)
	{
		System.out.print(str);
	}

	public static void out(int[] str)
	{
		System.out.print("[");

		for (int i = 0; i < str.length; i++)
		{
			System.out.print(str[i] + ",");
		}

		System.out.print("\b]\n");
	}

	public static void out(int[][] str)
	{
		System.out.print("[");

		for (int i = 0; i < str.length; i++)
		{
			System.out.print("[");

			for (int j = 0; j < str[i].length; j++)
			{
				System.out.print(str[i][j] + ",");
			}

			System.out.print("\b],");
		}

		System.out.print("\b]\n");
	}
	
	public static void out(int[][][] str)
	{
		System.out.print("[");

		for (int i = 0; i < str.length; i++)
		{
			System.out.print("[");

			for (int j = 0; j < str[i].length; j++)
			{
				System.out.print("[");
				
				for (int k = 0; k < str[i][j].length; k++)
				{
					System.out.print(str[i][j][k] + ",");
				}
				
				System.out.print("\b],");
			}

			System.out.print("\b],");
		}

		System.out.print("\b]\n");
	}
	
	public static void outMultiline(int[][] str)
	{
		System.out.print("[[");

		for (int i = 0; i < str.length; i++)
		{
			if (i != 0)
				System.out.print(" [");

			for (int j = 0; j < str[i].length; j++)
			{
				System.out.print(str[i][j] + ",");
			}

			System.out.print("\b]\n");
		}

		System.out.print("\b]\n");
	}

	public static void out(double str)
	{
		System.out.println(str);
	}

	public static void line(double str)
	{
		System.out.print(str);
	}

	public static void out(char str)
	{
		System.out.println(str);
	}

	public static void line(char str)
	{
		System.out.print(str);
	}

	public static void out(Object str)
	{
		System.out.println(str);
	}

	public static void line(Object str)
	{
		System.out.print(str);
	}

	public static void out(Object[] str)
	{
		System.out.print("[<");

		for (int i = 0; i < str.length; i++)
		{
			System.out.print(str[i] + ">,<");
		}

		System.out.print("\b\b] \n");
	}

	public static void outLineByLine(Object[] str)
	{
		System.out.print("[<");

		for (int i = 0; i < str.length; i++)
		{
			System.out.print(str[i] + ">,\n<");
		}

		System.out.print("\b\b] \n");
	}

	public static void coolOut(String str)
	{
		System.out.println("Dylan Finch proudly prints for your pleasure: " + str);
	}

	public static void test(int str)
	{
		System.out.println("Test: " + str);
	}

	public static boolean toBool(int boolToBe)
	{
		return boolToBe == 0? false : true;
	}

	public static boolean toBool(String boolToBe)
	{
		return boolToBe == "true"? true : false;
	}

	public static boolean toBool(char boolToBe)
	{
		return boolToBe == 't'? true : false;
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
}
