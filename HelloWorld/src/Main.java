
public class Main {

	public static void main(String[] args) {
		
		int a = 10000000;
				
		if(a>=1 && a <=1000000) {
			if(a>=1 && a<10) {
				System.out.println("Egyjegyû");
			}
			else if (a>=10 && a<100) {
				System.out.println("Kétjegyû");
			}
			else if (a>=100 && a<1000) {
				System.out.println("Háromjegyû");
			}
			else if (a>=1000 && a<10000) {
				System.out.println("Négyjegyû");
			}
			else if (a>=10000 && a<100000) {
				System.out.println("Ötjegyû");
			}
			else if (a>=100000 && a<1000000) {
				System.out.println("Hatjegyû");
			}
			else if (a==1000000) {
				System.out.println("Hétjegyû");
			}
		}
		else {
			System.out.println("Nem megfelelõ szám");
		}
		
	}
}
