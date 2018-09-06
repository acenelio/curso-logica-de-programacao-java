import java.util.Scanner;

//nao esqueca de mudar o nome da classe para Main
public class uri1007 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, dif;

	    A = sc.nextInt();
	    B = sc.nextInt();
	    C = sc.nextInt();
	    D = sc.nextInt();

	    dif = A * B - C * D;

	    System.out.println("DIFERENCA = " + dif);	
		
		sc.close();
	}
}
