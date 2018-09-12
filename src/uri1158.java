import java.util.Scanner;

//nao esqueca de mudar o nome da classe para Main
public class uri1158 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int soma = 0;
			int cont = 0;
			for (int j=x; cont<y; j++) {
				if (j % 2 != 0) {
					soma = soma + j;
					cont = cont + 1;
				}
			}
			
			System.out.println(soma);
		}
		
		sc.close();
	}
}
