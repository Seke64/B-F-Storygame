public class Item extends Entity
{
  public String devName;
  public String desc;
  public int maxCount;

  public Item (String _name, String _devName, String _desc, int _maxCount)
  {
    super(_name);
    devName = _devName;
    desc = _desc;
    maxCount = _maxCount;
  }
}
