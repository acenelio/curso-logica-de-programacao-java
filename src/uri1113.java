import java.util.Scanner;

//nao esqueca de mudar o nome da classe para Main
public class uri1113 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();

		while (X != Y) {
			if (X < Y) {
				System.out.println("Crescente");
			} else {
				System.out.println("Decrescente");
			}
			X = sc.nextInt();
			Y = sc.nextInt();
		}

		sc.close();
	}
}
