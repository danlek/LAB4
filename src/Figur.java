
public class Figur 
{
	private int x = 0;
	private int y = 0;
	private String typ = "";
	private int storlek = 0;
	
	public Figur(String objektTyp, int xIn, int yIn, int objektStorlek)
	{
		typ = objektTyp;
		x = xIn;
		y = yIn;
		storlek = objektStorlek;
	}
	public String draw()
	{
		return typ;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public int getStorlek()
	{
		return storlek;
	}
	public void move(int xIn, int yIn)
	{
		x = xIn;
		y = yIn;
	}
	
}
