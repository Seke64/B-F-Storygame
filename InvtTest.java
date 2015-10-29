public class InvtTest
{
  public static void main(String[] args)
  {
    Invt invt = new Invt();

    while (true)
    {
  		Dfl.out(invt + "\n\n");
  		Dfl.line("Example: add [name] [maxCount] [num]\nequip weapon [name] [maxCount] [num]\nInput:\n> ");
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
  		
  		else if (input.split(" ")[0].equals("equip") && input.split(" ")[1].equals("weapon"))
  		{
  			Weapon w = new Weapon(input.split(" ")[2], input.split(" ")[2], input.split(" ")[2], Integer.parseInt(input.split(" ")[3])), Integer.parseInt(input.split(" ")[4]);
  			invt.addItem(w);
  			invt.equipWeapon(w);
  		}

  		else
	  	{
		  	Dfl.out("Invalid");
		  }
	  }
  }
}
