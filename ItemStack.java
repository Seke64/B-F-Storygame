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
  
  public int addWhatCan(int num)
  {
    int leftOver = numItems + num - itemStack.maxCount;
    
    if (leftOver <= 0)
    {
      numItems += num;
    }
    
    else
    {
      numItems = itemStack.maxCount;
    }
    
    return leftOver;
  }
  
  public int whatIsLeftOver(int num)
  {
    return leftOver = numItems + num - itemStack.maxCount;
  }
}
