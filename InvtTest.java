public class InvtTest
{
  public static void main(String[] args)
  {
    Invt invt = new Invt();

    while (true)
    {
  		Dfl.out(invt + "\n\n");
  		Dfl.line("Example: add [name] [devName] [desc] [maxCount] [num]\nequip weapon [name] [devName] [desc] [maxCount] [num]\nInput:\n> ");
  		String input = Keyboard.readString();

	  	Dfl.newLine();

	  	try
	  	{

			if (input.equals("exit"))
			{
				break;
			}

			else if (input.split(";")[0].equals("add"))
			{
				invt.addItem(new Item(input.split(";")[1], input.split(";")[2], input.split(";")[3], Integer.parseInt(input.split(";")[4])), Integer.parseInt(input.split(";")[5]));
			}

			else if (input.split(";")[0].equals("equip-weapon"))
			{
				Weapon w = new Weapon(input.split(";")[1], input.split(";")[2], input.split(";")[3], Integer.parseInt(input.split(";")[4]), new int[] {0});
				invt.addItem(w, Integer.parseInt(input.split(";")[5]));
				invt.equipWeapon(w);
			}

			else
			{
				Dfl.out("Invalid\n");
			  }
		  }
		 catch(Exception e)
		 {
			 Dfl.out("Invalid\nException:" + e + "\n");
		 }
	  }
  }
}
