
public class Main {

	public static void main(String[] args) {
		int szam1 = Integer.parseInt(args[0]);
		int szam2 = Integer.parseInt(args[1]);
		
		int osszeg = szam1 + szam2;
		int kulonbseg = szam1 - szam2;
		int szorzat = szam1 * szam2;
		double hanyados = (double) szam1 / szam2;
		
		System.out.println("�sszeg: " + osszeg);
		System.out.println("K�l�nbs�g: " + kulonbseg);
		System.out.println("Szorzat: " + szorzat);
		System.out.println("H�nyados: " + hanyados);
	}
}
