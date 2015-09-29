public class NewHero
{
	String name;
	int[] stats;// MHP, MAN, ATT, DEF, MAG, RES, SPD, LUC, CHP, CMN, LVL, MNY, EXP
	String[] statNames = {"Max HP", "Max Mana","Damage", "Defense","Magic Damage","Magic Resistance","Speed", "Luck"};
	public static final int MHP = 0, MMN = 1, ATT = 2, DEF = 3, MAG = 4, RES = 5, SPD = 6, LUC = 7, CHP = 8, CMN = 9, LVL = 10, MNY = 11, EXP = 12, LXL = 13;

	public NewHero(String _name, int[] _stats)
	{
		name = _name;
		stats = _stats;
	}

	public static NewHero choose()
	{
		NewHero hero1 = new NewHero("Guy", new int[] {20,10,2,0,0,0,1,1,20,10,0,0,0,10});

		NewHero[] heros = {hero1};

		return heros[Gen.randNum(0, heros.length - 1)];
	}

	public String printStats()
	{
		String out = "";

		String[] strs = (String[]) statNames.clone();

		for (int i = 0; i < statNames.length; i++)
		{
			strs[i] += ":";
		}

		strs = normalizeStr(strs);

		for (int i = 0; i < statNames.length; i++)
		{
			if (i != 0)
				out += "\n";

			out += strs[i] + stats[i];
		}

		return out;
	}

	public int getStat(int stat)
	{
		if (stat > 13 || stat < 0)
		{
			System.err.println("Error in JGHero.java, getStat() method: Invalid stat (" + stat + "). Must be between 1 and 13.");
			return -1;
		}

		return stats[stat];
	}

	public void setStat(int stat, int set)
	{
		if (stat > 13 || stat < 0)
		{
			System.err.println("Error in JGHero.java, setStat() method: Invalid stat (" + stat + "). Must be between 1 and 13.");
		}
		stats[stat] = set;
	}

	public void changeStat(int stat, int val)
	{
		stats[stat] += val;
	}

	public int[] getStats()
	{
		return stats;
	}

	public String getName()
	{
		return name;
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

}
