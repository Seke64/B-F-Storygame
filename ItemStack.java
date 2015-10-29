import java.util.*;

public class ItemStack
{
  public int numItems;
  public Item itemStack;

  public ItemStack(Item i, int num)
  {
    numItems = num;
    itemStack = i;
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
    return numItems + num - itemStack.maxCount;
  }

  public String toString()
  {
    return "(" + numItems + ") " + itemStack.name + " (ID: " + itemStack.devName + ") - " + itemStack.desc;
  }
}
