import java.util.Scanner;

//nao esqueca de mudar o nome da classe para Main
public class uri1132 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int menor = x;
		int maior = y;
		
		if (x > y) {
			menor = y;
			maior = x;
		}

		int soma = 0;
		for (int i=menor; i<=maior; i++) {
			if (i % 13 != 0) {
				soma = soma + i;
			}
		}

		System.out.println(soma);
		
		sc.close();
	}
}
