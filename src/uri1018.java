import java.util.Scanner;

//nao esqueca de mudar o nome da classe para Main
public class uri1018 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N, quociente, resto, nota;
		
		N = sc.nextInt();
		System.out.println(N);

		resto = N;

		nota = 100;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
	    resto = resto % nota;

		nota = 50;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
	    resto = resto % nota;

		nota = 20;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
	    resto = resto % nota;

		nota = 10;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
	    resto = resto % nota;

		nota = 5;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
	    resto = resto % nota;

		nota = 2;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
	    resto = resto % nota;

		System.out.println(resto + " nota(s) de R$ 1,00");

		sc.close();
	}
}
