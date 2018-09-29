import java.util.Locale;
import java.util.Scanner;

public class vetor6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		String[] nomes = new String[N];
		int[] idades = new int[N];
		
		for (int i=0; i<N; i++) {
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();
		}

		// 1: primeiro vamos encontrar a posicao da maior idade
		int maiorIdade = idades[0];
		int posicaoMaiorIdade = 0;
		
		for (int i=1; i<N; i++) {
			if (idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				posicaoMaiorIdade = i;
			}
		}
		
		// 2: agora vamos acessar o vetor de nomes na posicao da maior idade
		System.out.println("Pessoa mais velha: " + nomes[posicaoMaiorIdade]);
		

		sc.close();
	}
}
