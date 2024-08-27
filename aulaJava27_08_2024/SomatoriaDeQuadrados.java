package aulaJava27_08_2024;

import java.util.Scanner;

public class SomatoriaDeQuadrados {

	public static void main(String[] args) {

		int N = 0, i;
		double somaTotal = 0, result = 0;
		System.out.println("Soma de todos os quadrados iterando de 1 ao número N");
		System.out.println("----------------------------------------------------");
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("Digite um número N inteiro positivo: ");
			N = scanner.nextInt();
			if (N > 0) {
				break; //Apenas testando o break da condição
			}
		}while(true);
		scanner.close();
		
		for (i = 1; i <= N; i++) {
			result = Math.pow(i, 2);
			somaTotal += result;
			System.out.println(i + "^" + "2 = " + result);
		}
		System.out.println("Soma de todos os quadrados: " + somaTotal);
	}

}
