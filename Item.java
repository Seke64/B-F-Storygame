public class Item extends Entity
{
  public String desc;
  public int maxCount;

  public Item (String _name, String _desc, int _maxCount)
  {
    super(_name);
    desc = _desc;
    maxCount = _maxCount;
  }
}
