import java.util.Scanner;

public class AnaliseDeDados {
	public static void main(String[] args) {
		double dados[] = new double[args.length];
		
		for (int i=0 ; i<args.length ; i++) {
			dados[i] = Double.parseDouble(args[i]);
		}
		
/*		System.out.println("\nMédia dos dados: " + media(dados));
		System.out.println("Menor numero: " + menor(dados));
		System.out.println("Maior numero: " + maior(dados));
*/
	}
	
	public static double inserirDados() {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Número: ");
		double dados = ler.nextDouble();
		
		return(dados);
	}
	
	public static double media(double[] dados) {
		double somaDasNotas = 0;
		for (int i=0 ; i<dados.length ; i++) {
			somaDasNotas += dados[i];
		}
		return(somaDasNotas / dados.length);
	}

	public static double menor(double[] dados) {
		double menorNumero = dados[0];
		for (int i=1 ; i<dados.length ; i++) {
			if (menorNumero > dados[i]) {
				menorNumero = dados[i];
			}
		}
		return(menorNumero);
	}

	public static double maior(double[] dados) {
		double maiorNumero = dados[0];
		for (int i=1 ; i<dados.length ; i++) {
			if (maiorNumero < dados[i]) {
				maiorNumero = dados[i];
			}
		}
		return(maiorNumero);
	}
}