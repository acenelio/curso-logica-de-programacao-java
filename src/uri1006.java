import java.util.Locale;
import java.util.Scanner;

//nao esqueca de mudar o nome da classe para Main
public class uri1006 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y, z, med;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		z = sc.nextDouble();
		
		med = (x*2.0+y*3.0+z*5.0) / 10.0;
		
		System.out.printf("MEDIA = %.1f\n", med);		
		
		sc.close();
	}
}
