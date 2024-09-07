package Geral;

import javax.swing.JOptionPane;

public class MediaPonderada {

	public static void main(String[] args) {
		double notas[][][] = new double [2][4][2]; /// notas[qtdAlunos][qtdProvas][nota, nota ponderada]
		int numProva, numAluno;
		double mediaPond = 0;
		
		///Passa pelo array de cada "aluno" prenchendo as notas de cada prova
		numAluno = 0;
		for (int i = 0; i < 2; i++) {
			numAluno++;
			numProva = 0;
			for (int j = 0; j < 4; j++) {
				numProva++;
				do {
					notas[i][j][0] = Double.parseDouble(JOptionPane.showInputDialog("(ALUNO " + numAluno + ") - PROVA " + numProva + "\n Digite a nota: "));
					if (notas[i][j][0] < 0 || notas[i][j][0] > 10) {
						JOptionPane.showMessageDialog(null, "Nota inválida, tente novamente.");
					}
				}while(notas[i][j][0] < 0 || notas[i][j][0] > 10); //Tratamento de erros
			}
		}
	
		
		
		int j = 0;
		numAluno = 0;
		for (double aluno[][]: notas) {  //Passa pelas notas de cada aluno, fazendo o cálculo da nota ponderada e da média final
			int i = 0;
			j++;
			System.out.println("-------------------");
			System.out.println("ALUNO " + j);
			System.out.println("");
			
			for (double provaInfo[] : aluno) {	
				mediaPond = 0;
				i++;
				
				switch(i) { //Identifica qual a prova e qual peso de nota aplicar
				case 1: 
					provaInfo[1] = provaInfo[0] / 1;
					mediaPond += provaInfo[1];
					break;
				case 2: 
				case 3:
					provaInfo[1] = provaInfo[0] / 2;
					mediaPond += provaInfo[1];
					break;
				case 4: 
					provaInfo[1] = provaInfo[0] / 5;
					mediaPond += provaInfo[1];
					break;
				}
				
			}
			numProva = 0;
			
			//Exibe todas as informações sobre as provas
			for (int z = 0; z < 4; z++) {
				numProva++;
				System.out.println("-PROVA " + numProva + "-");
				System.out.println("Nota: " + notas[j-1][z][0]);
				System.out.println("Nota ponderada " + notas[j-1][z][1]);
				System.out.println("");
				
			}
		
			//Exibe a média final
			System.out.println("MÉDIA: " + mediaPond / 0.2);
			System.out.println("");
			
		}

	}
}
