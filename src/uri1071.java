import java.util.Scanner;

//nao esqueca de mudar o nome da classe para Main
public class uri1071 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int min, max;
		if (x < y) {
			min = x;
			max = y;
		}
		else {
			min = y;
			max = x;
		}
		
		int soma = 0;
		for (int i=min+1; i<max; i++) {
			if (i % 2 != 0) {
				soma = soma + i;
			}
		}

		System.out.println(soma);
		
		sc.close();
	}
}
