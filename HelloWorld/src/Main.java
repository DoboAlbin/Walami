
public class Main {

	public static void main(String[] args) {
		
		int a = 10000000;
				
		if(a>=1 && a <=1000000) {
			if(a>=1 && a<10) {
				System.out.println("Egyjegy�");
			}
			else if (a>=10 && a<100) {
				System.out.println("K�tjegy�");
			}
			else if (a>=100 && a<1000) {
				System.out.println("H�romjegy�");
			}
			else if (a>=1000 && a<10000) {
				System.out.println("N�gyjegy�");
			}
			else if (a>=10000 && a<100000) {
				System.out.println("�tjegy�");
			}
			else if (a>=100000 && a<1000000) {
				System.out.println("Hatjegy�");
			}
			else if (a==1000000) {
				System.out.println("H�tjegy�");
			}
		}
		else {
			System.out.println("Nem megfelel� sz�m");
		}
		
	}
}
