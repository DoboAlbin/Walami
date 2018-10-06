
public class Main {

	public static void main(String[] args) {
		int szam1 = Integer.parseInt(args[0]);
		int szam2 = Integer.parseInt(args[1]);
		
		int osszeg = szam1 + szam2;
		int kulonbseg = szam1 - szam2;
		int szorzat = szam1 * szam2;
		double hanyados = (double) szam1 / szam2;
		
		System.out.println("Összeg: " + osszeg);
		System.out.println("Különbség: " + kulonbseg);
		System.out.println("Szorzat: " + szorzat);
		System.out.println("Hányados: " + hanyados);
	}
}
