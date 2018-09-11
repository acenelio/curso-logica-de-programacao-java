import java.util.Scanner;

//nao esqueca de mudar o nome da classe para Main
public class uri1131 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int vitoriasInter = 0;
		int vitoriasGremio = 0;
		int empates = 0;
		int novoGrenal = 1;
		
		while (novoGrenal == 1) {
			int golsInter = sc.nextInt();
			int golsGremio = sc.nextInt();
			
			if (golsInter > golsGremio) {
				vitoriasInter = vitoriasInter + 1;
			}
			else if (golsGremio > golsInter) {
				vitoriasGremio = vitoriasGremio + 1;
			}
			else {
				empates = empates + 1;
			}

			System.out.println("Novo grenal (1-sim 2-nao)");
			novoGrenal = sc.nextInt();
		}
		
		int total = vitoriasGremio + vitoriasInter + empates;
		
		System.out.println(total + " grenais");
		System.out.println("Inter:" + vitoriasInter);
		System.out.println("Gremio:" + vitoriasGremio);
		System.out.println("Empates:" + empates);
		
		if (vitoriasInter > vitoriasGremio) {
			System.out.println("Inter venceu mais");
		}
		else if (vitoriasGremio > vitoriasInter) {
			System.out.println("Gremio venceu mais");
		}
		else {
			System.out.println("Nao houve vencedor");
		}
		
		sc.close();
	}
}
