package aulaJava26_08_2024;

import java.util.Scanner;

public class Repetição {

	public static void main(String[] args) {
		int i = 0, numTab, resultTab;
		int numFat, resultFat = 1;
		
		///TABUADA
		System.out.print("Digite um número inteiro para exibir sua tabuada: ");
		Scanner scanner = new Scanner(System.in);
		numTab = scanner.nextInt();

		System.out.print("");
		System.out.println("Tabuada do número " + numTab);
		
		for (i = 0; i <= 10; i++) {
			resultTab = numTab * i;
			System.out.println(numTab + " x " + i + " = " + resultTab);
		}
		
		System.out.println("");
		
		///FATORIAL
		System.out.print("Digite um número inteiro para exibir seu fatorial: ");
		numFat = scanner.nextInt();


		System.out.print("");
		
		for (i = numFat; i >= 1; i--) {
			resultFat *= i;
		}
		
		System.out.println(numFat + "!" + " = " + resultFat);
		scanner.close();	
	}
	
}
