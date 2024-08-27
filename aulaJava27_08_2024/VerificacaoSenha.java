package aulaJava27_08_2024;

import java.util.Scanner;

public class VerificacaoSenha {

	public static void main(String[] args) {
		/*Escreva um código em Java que solicite duma senha formada por 6 dígitos, primeiro verificar se a
		quantidade de dígitos esta correta, caso não esteja exibir uma mensagem de alerta e solicitar
		novamente a senha, se a quantidade de dígitos estiver correta verificar se a senha. Se estiver
		correta mostrar a mensagem “Senha Correta”, caso contrário mostrar “Senha Incorreta”
		(OBS. Neste exercício a senha estará numa final String.*/
	
		final String senha = "senha7";
		String text;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Digite a senha: ");
			text = scanner.nextLine();
			if (text.length() != 6) {
				System.out.println("!! A senha precisa conter 6 dígitos. !!");
				System.out.println("");
			}
		}while(text.length() != 6);
		scanner.close();
		System.out.println("");
		if (text.equals(senha)) {
			System.out.println("Senha correta.");
		}
		else {
			System.out.println("Senha incorreta.");
		}
		
		
		
		
	}
}
