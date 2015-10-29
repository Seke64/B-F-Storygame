import java.util.*;

public class Invt
{
  private ArrayList<ItemStack> items;
  private Weapon weapon = null;
  private Armor armor = null;

  public Invt()
  {
	  items = new ArrayList<ItemStack>();
  }

  public void removeItem(Item remove, int num)
  {
  	int count = 0;
  	int start = -1;

  	for (ItemStack i: items)
  	{
  		if (i.itemStack.devName.equals(remove.devName))
  		{
			if (count == 0)
				start = items.indexOf(i);
  			count += i.numItems;
  		}
  	}

  	while (items.size() > 0 && items.get(start).itemStack.devName.equals(remove.devName))
  	{
  		items.remove(start);
  	}

  	Dfl.out("Invt: " + items);

  	if (count - num > 0)
  	{
  		addItem(remove, count - num);
  	}
  }

  public void addItem(Item add, int num)
  {
  	if (num < 0)
  	{Dfl.test(1);
  		removeItem(add, -1 * num);
  		return;
  	}

	int index = 0;
	int placeToAdd = -1;

    for (ItemStack i: items)
    {
      if (add.devName.equals(i.itemStack.devName))
      {
	if (i.whatIsLeftOver(num) <= 0)
	{
          i.add(num);
          num -= num;
	}

	else
	{
	  placeToAdd = index;
	  int addNow = (num - i.whatIsLeftOver(num));
	  i.add(addNow);
	  num -= addNow;
	}
      }
      index++;
    }

	if (placeToAdd == -1)
	  placeToAdd = items.size();

    while (num > 0)
    {
      if (num > add.maxCount)
      {
        items.add(placeToAdd, new ItemStack(add, add.maxCount));
        num -= add.maxCount;
      }

      else
      {
        items.add(placeToAdd + 1 > items.size()? placeToAdd : placeToAdd + 1, new ItemStack(add, num));
        num -= num;
      }

      placeToAdd++;
    }
  }

  public void equipWeapon(Weapon w)
  {
  	//if (weapon is in invt)
  	weapon = w;
  }

  public void unEquipWeapon()
  {
  	weapon = null;
  }

  public void equipAromor(Armor a)
  {
  	armor = a;
  }

  public void unequipArmor()
  {
  	armor = null;
  }

  public String toString()
  {
    String out = "Inventory:";

    for (ItemStack is: items)
    {
      out += "\n " + is;
    }

    if (weapon != null)
    {
    	out += "\nWeapon: " + weapon;
    }

    if (armor != null)
    {
    	out += "\nArmor: " + armor;
    }

    if (out.equals("Inventory:"))
    {
      out += "\nYou have no items.";
    }

    return out;
  }
}
