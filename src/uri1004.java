import java.util.Locale;
import java.util.Scanner;

//nao esqueca de mudar o nome da classe para Main
public class uri1004 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y, prod;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		prod = x*y;
		
		System.out.println("PROD = " + prod);
		
		sc.close();
	}
}
