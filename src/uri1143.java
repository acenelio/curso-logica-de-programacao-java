import java.util.Scanner;

//nao esqueca de mudar o nome da classe para Main
public class uri1143 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i=1; i<=n; i++) {
			
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", i, segundo, terceiro);
		}
		
		sc.close();
	}
}
