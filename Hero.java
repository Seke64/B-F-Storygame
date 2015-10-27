public class Hero extends GameCharacter 
{
	public int curHp;
	public int level;
	public int gold;
	public int xp;

	public Hero(String _name, int[] _baseStats)
	{
		super(_name, _baseStats);
		curHp = this.getBaseStat(MHP);
		level = 1;
		gold = 0;
		xp = 0;
	}

	public static Hero choose()
	{
		Hero hero1 = new Hero("Guy", new int[] {20, 1, 2, 1, 0});

		Hero[] heros = {hero1};

		return heros[Gen.randNum(0, heros.length - 1)];
	}

	public static String[] normalizeStr(String[] strs)
	{
		int longest = 0;

		for (int i = 0; i < strs.length; i++)
		{
			if (strs[i].length() > longest)
				longest = strs[i].length();
		}

		for (int i = 0; i < strs.length; i++)
			for (int j = strs[i].length(); j <= longest; j++)
				strs[i] += " ";
		return strs;
	}
	public static int[] getBaseStat()
	{
		return baseStats;
		//super.baseStats?
	}
	public static int changeGold(int currentGold, int enemyGold)
	{
		int gold = currentGold + enemyGold;
		return gold;
	}
	public static int changeXp(int currentXp, int enemyXp)
	{
		int xp = currentXp + enemyXp;
		return xp;
	}
	
}
