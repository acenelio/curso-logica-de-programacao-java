import java.util.Scanner;

//nao esqueca de mudar o nome da classe para Main
public class uri1142 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int inicio = 1;
		
		for (int i=1; i<=n; i++) {
			
			int segundo = inicio + 1;
			int terceiro = inicio + 2;
			System.out.printf("%d %d %d PUM%n", inicio, segundo, terceiro);

			inicio = inicio + 4;
		}
		
		sc.close();
	}
}
