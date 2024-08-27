package aulaJava27_08_2024;

import java.util.Scanner;

public class SomaNumerosAcumulados {

	public static void main(String[] args) {
		
		/*Escreva um código em Java que solicite números e acumule e conte os números digitados 
		enquanto o valor digitado seja diferente de 0. Se o número digitado for Par ele será
		somado no total, se for impar ele será subtraído do total. No final mostrar quantos 
	    números pare e impares foram digitados e o total acumulado.*/
		
		double num, soma = 0, quant = 0, resultFinal = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite os números para acumular (0 para finalizar): ");
		do {
			
			num = scanner.nextDouble();
			if (num == 0) {
				break;
			}
			soma += num;
			quant++;
			
		}while(true);
		scanner.close();
		
		System.out.println("A quantidade de números acumulados é: " + quant);
		System.out.println("Soma de todos os números: " + soma);
		System.out.println("");
		
		if (soma % 2 == 0) {
			resultFinal = soma + quant;
			System.out.println("Soma total + Quantidade de números acumulados = " + resultFinal);
		} else {
			resultFinal = soma - quant;
			System.out.println("Soma total - Quantidade de números acumulados = " + resultFinal);
		}
		
		

	}

}
