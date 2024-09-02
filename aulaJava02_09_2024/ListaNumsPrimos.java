package aulaJava02_09_2024;

import java.util.Scanner;

public class ListaNumsPrimos {

	public static void main(String[] args) {
		int num;
		boolean isPrimo;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		num = scanner.nextInt();
		scanner.close();
		
		for(int i = 1; i <= num; i++) {
			isPrimo = true;
			for(int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrimo = false;
					break;
				}
			}
			if(isPrimo){
				System.out.print(i + ", ");
			}
		}
	}

}
