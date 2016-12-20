//classe Cilindro
//eredita metodi classe Cerchio

public class Cilindro extends Cerchio 
{
	//attributi
	private double altezza;
		
	//costruttori
	public Cilindro (double raggio, double altezza)
	{
		super(raggio); //attributo superclasse
		this.altezza=altezza;
	}
	
	//metodi
	public double volume()
	{
		double vol=area()*altezza;
		return(vol);
	}
	
}

