public class InvtTest
{
  public static void main(String[] args)
  {
    Invt invt = new Invt();

    while (true)
    {
  		Dfl.out(invt + "\n\n");
  		Dfl.line("Example: add [name] [devName] [desc] [maxCount] [num]\nInput:\n> ");
  		String input = Keyboard.readString();

	  	Dfl.newLine();

	  	if (input.equals("exit"))
	  	{
  			break;
	  	}

  		else if (input.split(" ")[0].equals("add"))
  		{
  			invt.addItem(new Item(input.split(" ")[1], input.split(" ")[1], input.split(" ")[1], Integer.parseInt(input.split(" ")[2])), Integer.parseInt(input.split(" ")[3]));
  		}

  		else
	  	{
		  	Dfl.out("Invalid");
		  }
	  }
  }
}
