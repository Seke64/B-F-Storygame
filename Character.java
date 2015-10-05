public class Charcter extends Entity
{
  private int[] baseStats;
  
  protected static final String[] baseStatsNames = {"Max HP", "Attack", "Defense", "Speed", "Luck"};
  public static final MHP = 0, ATT = 1, DEF = 2, SPD = 3, LUC = 4;
  
  public Charcter(String _name, int[] _baseStats)
  {
    super(_name)
    baseStats = _baseStats;
  }
  
  public int getBaseStat(int stat)
  {
    return baseStats[stat];
  }
}
  
   
  
  
  
