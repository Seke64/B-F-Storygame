public class Enemy extends Character
{
  public Steing desc;
  public int goldReward;
  public int xpReward;

  public Enemy (String _name, int[] _baseStats, String _desc, int _goldReward, int _xpReward)
  {
    super(_name, _baseStats);
    desc = _desc;
    goldReward = _goldReward;
    xpReward = _xpReward;
    
    if (desc == null)
      desc = "It's a " + name + ".";
  }
  
  public chooseEnemy(int level)
  {
    Enemy[][] enemies = new Enemy[10][10];
    
    enemies[0][0] = new Enemy("Monster", new int[] {7, 1, 2, 3, 0}, null, 5, 7};
  }
}
