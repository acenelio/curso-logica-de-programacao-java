import java.util.Locale;
import java.util.Scanner;

//nao esqueca de mudar o nome da classe para Main
public class uri1016 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, resultado;
	    
		n = sc.nextInt();
		
		resultado = 2 * n;
		
		System.out.println(resultado + " minutos");
		
		sc.close();
	}
}
