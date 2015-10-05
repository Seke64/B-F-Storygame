public class Charcter
{
  private String name;
  private int[] baseStats;
  
  public static final String[] baseStatsNames = {"Max HP", "Attack", "Defense", "Speed", "Luck"};
  public static final MHP = 0, ATT = 1, DEF = 2, SPD = 3, LUC = 4;
  
  public Charcter(String _name, int[] _baseStats)
  {
    name = _name;
    baseStats = _baseStats;
  }
  
  public int getBaseStat(int stat)
  {
    return baseStats[stat];
  }
  
   
  
  
  