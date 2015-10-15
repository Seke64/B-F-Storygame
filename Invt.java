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
      }
      
      else if (add.devName.equals(i.itemStack.devName) && i.whatIsLeftOver(num) > 0)
      {
        int left = i.whatIsLeftOver(num);
        
        while (left > 0)
        {
          items.add(new ItemStack(add, 0);
          
          left =- i.itemStack.maxCount;
        }
      }
    }
  }
}
