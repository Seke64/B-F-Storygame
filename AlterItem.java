public class AlterItem extends Item
{
  public int[] alterStats;

  public AlterItem(_name, _desc, _alterStats)
  {
    super(_name, _desc)
    alterStats = _alterStats;
  }
}
