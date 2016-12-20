//classe Cerchio

public class Cerchio 
{
	//attributi
	private double raggio;
	
	//costruttori
	public Cerchio (double raggio)
	{
		this.raggio=raggio;
	}
	
	//metodi
	public double circonferenza()
	{
		return(2*raggio*Math.PI);
	}
	
	public double area()
	{
		return(raggio*raggio*Math.PI);
	}
}

	
