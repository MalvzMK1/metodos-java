import java.util.Scanner;

public class Vetor {
	public static void main(String[] args) {
		Scanner deco = new Scanner(System.in);
		
		double notas[] = new double[5];
			
		for (int i = 0 ; i < notas.length ; i++) {
			System.out.print((i+1) + "ª nota: ");
			notas[i] = deco.nextDouble();
		}
		
		System.out.println();
		
		double somaNotas = 0;
		
		for (int i = 0 ; i < notas.length ; i++) {
			System.out.println((i + 1) + "ª nota: " + notas[i]);
			somaNotas = somaNotas + notas[i];
		}
		
		double media = somaNotas / notas.length;
		
		System.out.println("Média = " + media);
	}
}