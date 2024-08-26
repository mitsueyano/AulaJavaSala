package aulaJava26_08_2024;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		String nome = "abc";
		String nome1;
		
		String nomeCase = "AbCdEfG";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o nome1 'abc': ");
		nome1 = scanner.nextLine();
		scanner.close();
		
		
		System.out.println(nome + " é o nome");
		System.out.println(nome1 + " é o nome1");
		System.out.println("");

		System.out.println("COM '==':");
		if (nome == nome1) {
			System.out.println("são iguais");
		} else {
			System.out.println("não são iguais");
		}
		
		System.out.println("");
		
		System.out.println("COM 'EQUALS':");
		if (nome.equals(nome1)) {
			System.out.println("são iguais");
		} else {
			System.out.println("não são iguais");
		}
		
		System.out.println("-------------");

		System.out.println("Usando 'toUpperCase/toLowerCase' o nome: " + nomeCase);
		System.out.print(nomeCase.toUpperCase());
		System.out.println("");
		System.out.println(nomeCase.toLowerCase());

		System.out.println("-------------");
		
		
		
		
		
		

	}

}
