import java.util.*;

public class Invt
{
  private ArrayList<ItemStack> items = new ArrayList<ItemStack>();
  
  public boolean addItem(Item add, int num)
  {
    for (ItemStack i: items)
    {
      if (add.devName.equals(i.itemStack.devName) && i.whatIsLeftOver(num) <= 0)
      {
        i.add(num);
        
        return true;
      }
    }
    
    while (num > 0)
    {
      if (num > add.maxCount
      {
        items.add(new ItemStack(add, add.maxCount);
        num -= add.maxCount;
      }
      
      else
      {
        items.add(new ItemStack(add, num));
        num -= num;
      }
    }
  }
  
  public String toString()
  {
    String out = "Inventory:";
    
    for (ItemStack is: items)
    {
      out += "\n" + is;
    }
    
    return out;
  }
}
