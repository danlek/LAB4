
public class Figurer 
{
	private int maxStorleken;
	private Figur[] arrayAvFigurer;
	private int antal = 0;
	
	public Figurer(int maxStorlek)
	{
		maxStorleken = maxStorlek;
		arrayAvFigurer = new Figur[maxStorlek];
	}
	public int maxStorlek()
	{
		return maxStorleken;
	}
	public void addObjekt(String objektTyp, int xIn, int yIn, int objektStorlek)
	{
		Figur F = new Figur(objektTyp, xIn, yIn, objektStorlek);
		arrayAvFigurer[antal] = F;
		antal++;
	}
	public int getAntal()
	{
		return antal;
	}
	public Figur objektAt(int pos)
	{
		return arrayAvFigurer[pos];
	}
	public void flyttaObjekt(int pos, int xIn, int yIn)
	{
		arrayAvFigurer[pos].move(xIn, yIn);
	}
}
