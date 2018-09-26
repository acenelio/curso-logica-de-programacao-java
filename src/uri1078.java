import java.util.Scanner;

//nao esqueca de mudar o nome da classe para Main
public class uri1078 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		
		for (int i=1; i<=10; i++) {
			int produto = i * N;
			System.out.println(i + " x " + N + " = " + produto);
		}
		
		sc.close();
	}
}
