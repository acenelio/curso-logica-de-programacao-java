import java.util.Scanner;

//nao esqueca de mudar o nome da classe para Main
public class uri1072 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in = in + 1;
			}
			else {
				out = out + 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}
}
