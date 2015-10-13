public class Item extends Entity
{
  public String desc;

  public Item (String _name, String _desc, int[] _alterStats)
  {
    super(_name);
    desc = _desc;
  }
}
