import java.util.Locale;
import java.util.Scanner;

//nao esqueca de mudar o nome da classe para Main
public class uri1094 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int coelhos = 0;
		int ratos = 0;
		int sapos = 0;
		
		for (int i=0; i<n; i++) {
			
			int quantia = sc.nextInt();
			char tipo = sc.next().charAt(0);
			
			if (tipo == 'C') {
				coelhos = coelhos + quantia;
			}
			else if (tipo == 'R') {
				ratos = ratos + quantia;
			}
			else {
				sapos = sapos + quantia;
			}
		}

		int total = coelhos + ratos + sapos;
		double porcentagemCoelhos = (double) coelhos / total * 100.0;
		double porcentagemRatos = (double) ratos / total * 100.0;
		double porcentagemSapos = (double) sapos / total * 100.0;

		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + coelhos);
		System.out.println("Total de ratos: " + ratos);
		System.out.println("Total de sapos: " + sapos);
		System.out.printf("Percentual de coelhos: %.2f %%%n", porcentagemCoelhos);
		System.out.printf("Percentual de ratos: %.2f %%%n", porcentagemRatos);
		System.out.printf("Percentual de sapos: %.2f %%%n", porcentagemSapos);
		
		sc.close();
	}
}
