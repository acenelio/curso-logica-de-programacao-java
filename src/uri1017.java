import java.util.Locale;
import java.util.Scanner;

//nao esqueca de mudar o nome da classe para Main
public class uri1017 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int tempo, velocidade;
		double litros;
		
		tempo = sc.nextInt();
		velocidade = sc.nextInt();
		
		litros = (double) tempo * velocidade / 12.0;
		
		System.out.printf("%.3f%n", litros);
		
		sc.close();
	}
}
