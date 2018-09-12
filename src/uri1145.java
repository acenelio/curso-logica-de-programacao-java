import java.util.Scanner;

//nao esqueca de mudar o nome da classe para Main
public class uri1145 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		for (int i=1; i<=y; i++) {
			System.out.print(i);
			if (i % x == 0) {
				System.out.println();
			}
			else {
				System.out.print(" ");
			}
		}
		
		sc.close();
	}
}
