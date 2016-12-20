/**calcolo:
 * 
 * area cerchio alla base
 * circonferenza cerchio alla base
 * volume Cilindro
 * 
 * EREDITARIETA'
 * 
 */


import java.util.Scanner;

public class ProvaCilindro 
{
	private static Scanner t;
	
	public static void main(String argv[])
	{
		
		double raggio, altezza;
		
		t=new Scanner(System.in);
		
		System.out.print("inserisci raggio base: ");
		raggio=t.nextInt();
		
		System.out.print("inserisci altezza cilindro: ");
		altezza=t.nextInt();
		
		Cilindro cil1=new Cilindro(raggio,altezza);
		
		System.out.println("l'area della base è "+cil1.area());//classe Cerchio
		System.out.println("ls circonferenza della base è "+cil1.circonferenza());//classe Cerchio
		System.out.println("il volume del cilindro è "+cil1.volume());//classe Cilindro
		
	}
}
