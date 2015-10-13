import java.util.*;

public class ItemStack 
{
  public int numItems;
  public Item itemStack;
  
  public ItemStack(Item i, int num)
  {
    numItems = num;
    itemSteck = i;
  }
  
  public boolean add(int num)
  {
    if (numItems + num <= itemStack.maxCount)
    {
      numItems += num;
      return true;
    }
    
    return false;
  }
}
