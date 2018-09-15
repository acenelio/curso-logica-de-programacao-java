import java.util.Locale;
import java.util.Scanner;

//nao esqueca de mudar o nome da classe para Main
public class uri1045 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		
		double A, B, C;
		if (n1 > n2 && n1 > n3) {
			A = n1;
			if (n2 > n3) {
				B = n2;
				C = n3;
			}
			else {
				B = n3;
				C = n2;
			}
		}
		else if (n2 > n3) {
			A = n2;
			if (n1 > n3) {
				B = n1;
				C = n3;
			}
			else {
				B = n3;
				C = n1;
			}
		}
		else {
			A = n3;
			if (n1 > n2) {
				B = n1;
				C = n2;
			}
			else {
				B = n2;
				C = n1;
			}
		}
		
		if (A >= B+C) {
			System.out.println("NAO FORMA TRIANGULO");
		}
		else {
			// primeiro vamos testas as tres possibilidades em relacao a angulos
			if (A*A == B*B + C*C) {
				System.out.println("TRIANGULO RETANGULO");
			}
			else if (A*A > B*B + C*C) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			else {
				System.out.println("TRIANGULO ACUTANGULO");
			}

			// agora vamos testar se pode ser equilatero ou isosceles
			if (A == B && B == C) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			else if (A == B || A == C || B == C) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
		
		sc.close();
	}
}
