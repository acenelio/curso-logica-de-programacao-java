import java.util.Locale;
import java.util.Scanner;

//nao esqueca de mudar o nome da classe para Main
public class uri1061 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int W1, X1, Y1, Z1, W2, X2, Y2, Z2, W, X, Y, Z, inicio, fim, duracao, resto;
		String s;

		s = sc.next();
		W1 = sc.nextInt();
		X1 = sc.nextInt();
		s = sc.next();
		Y1 = sc.nextInt();
		s = sc.next();
		Z1 = sc.nextInt();
		s = sc.next();
		W2 = sc.nextInt();
		X2 = sc.nextInt();
		s = sc.next();
		Y2 = sc.nextInt();
		s = sc.next();
		Z2 = sc.nextInt();
		
		inicio = W1*24*60*60 + X1*60*60 + Y1*60 + Z1;
		fim = W2*24*60*60 + X2*60*60 + Y2*60 + Z2;
		duracao = fim - inicio;
		
		W = duracao / (24*60*60);
		resto = duracao % (24*60*60);
		X = resto / (60*60);
		resto = resto % (60*60);
		Y = resto / 60;
		Z = resto % 60;
		
		System.out.println(W + " dia(s)");
		System.out.println(X + " hora(s)");
		System.out.println(Y + " minuto(s)");
		System.out.println(Z + " segundo(s)");		
		
		sc.close();
	}
}
