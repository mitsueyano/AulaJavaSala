package aulaJava27_08_2024;

import java.util.Scanner;

public class SaberSePrimo {

	public static void main(String[] args) {
		/*Faça um programa que verifique se um numero digitado pelo usuário é primo. 
		  Números primos são divisíveis somente por 1 e por ele mesmo.*/
		
		int num;
		boolean isPrimo = true;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número para saber se é primo: ");
		num = scanner.nextInt();
		scanner.close();
		
		for(int i = 2 ; i < num; i++){
			  if (num % i == 0) {
				  isPrimo = false;
				  break;
			  }
		}
		if(isPrimo) {
			System.out.println("O número " + num + " é um número primo.");
		} else {
			System.out.println("O número " + num + " não é um número primo.");
		}

	}

}
