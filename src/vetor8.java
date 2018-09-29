import java.util.Locale;
import java.util.Scanner;

public class vetor8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		double[] alturas = new double[N];
		char[] sexos = new char[N];
		
		for (int i=0; i<N; i++) {
			alturas[i] = sc.nextDouble();
			sexos[i] = sc.next().charAt(0);
		}

		// 1: menor altura
		double menorAltura = alturas[0];
		for (int i=1; i<N; i++) {
			if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}
		}
		System.out.printf("Menor altura = %.2f%n", menorAltura);

		// 2: maior altura
		double maiorAltura = alturas[0];
		for (int i=1; i<N; i++) {
			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}
		}
		System.out.printf("Maior altura = %.2f%n", maiorAltura);

		// 3: altura media das mulheres
		double somaDasAlturasDasMulheres = 0.0;
		int contMulheres = 0;
		for (int i=0; i<N; i++) {
			if (sexos[i] == 'F') {
				somaDasAlturasDasMulheres = somaDasAlturasDasMulheres + alturas[i];
				contMulheres++;
			}
		}
		
		if (contMulheres == 0) {
			System.out.println("Nao ha nenhuma mulher dentre as pessoas");
		}
		else {
			double media = somaDasAlturasDasMulheres / contMulheres;
			System.out.printf("Media das alturas das mulheres = %.2f%n", media);
		}
		
		// 4: numero de homens
		int contHomens = 0;
		for (int i=0; i<N; i++) {
			if (sexos[i] == 'M') {
				contHomens++;
			}
		}
		System.out.println("Numero de homens = " + contHomens);
		
		sc.close();
	}
}
