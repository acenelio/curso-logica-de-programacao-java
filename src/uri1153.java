import java.util.Scanner;

//nao esqueca de mudar o nome da classe para Main
public class uri1153 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int fat = 1;
		for (int i=1; i<=n; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		
		sc.close();
	}
}
