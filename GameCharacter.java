public class GameCharacter extends Entity
{
  protected int[] baseStats;
  
  public static final String[] baseStatsNames = {"Max HP", "Attack", "Defense", "Speed", "Luck"};
  public static final int MHP = 0, ATT = 1, DEF = 2, SPD = 3, LUC = 4;
  
  public GameCharacter(String _name, int[] _baseStats)
  {
    super(_name);
    baseStats = _baseStats;
  }
  
  public int getBaseStat(int stat)
  {
    return baseStats[stat];
  }
  
  public int setBaseStat(int stat, int val)
  {
    baseStats[stat] = val;
    return baseStats[stat];
  }
  
  public int changeBaseStat(int stat, int val)
  {
    baseStats[stat] += val;
    return baseStats[stat];
  }
  public static int[] getOtherStat()
  {
	int[] otherStat = new int[3];
	otherStat[0] = level;
	otherStat[1] = gold;
	otherStat[2] = xp;
	return otherStat;
   }
}
  
   
  
  
  
