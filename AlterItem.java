public class AlterItem extends Item
{
  public int[] alterStats;

  public AlterItem(_name, _desc, _maxCount, _alterStats)
  {
    super(_name, _desc, _maxCount);
    alterStats = _alterStats;
  }
}
