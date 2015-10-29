public class AlterItem extends Item
{
  public int[] alterStats;

  public AlterItem(String _name, String _devName, String _desc, int _maxCount, int[] _alterStats)
  {
    super(_name, _devName, _desc, _maxCount);
    alterStats = _alterStats;
  }
}
