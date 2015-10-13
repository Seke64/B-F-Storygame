import java.util.*;

public class Invt
{
  private ArrayList<ItemStack> items = new ArrayList<ItemStack>();
  
  public boolean addItem(Item add)
  {
    for (ItemStack i: items)
    {
      if (add.devName.equals(i.itemStack.devName) && i.add(add))
      {
        i.add(add);
      }
    }
  }
}
