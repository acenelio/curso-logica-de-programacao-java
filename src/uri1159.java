import java.util.Scanner;

//nao esqueca de mudar o nome da classe para Main
public class uri1159 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while (x != 0) {
			
			// se for impar, some mais 1
			if (x % 2 != 0) {
				x = x + 1;
			}
			
			// expressao simplificada: 5 * x + 20
			int soma = x + x + 2 + x + 4 + x + 6 + x + 8; 
			System.out.println(soma);
			
			x = sc.nextInt();
		}
		
		sc.close();
	}
}
