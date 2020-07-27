package application;

import jogo.PecaDoJogo;

public class UI {

	public static void imprimirTabuleiro(PecaDoJogo[][] pecas) {
		int linha = 3;
		int posicaoLinha = 0;
		
		for (int i = 0; i <= 4; i++) {
			if (i % 2 == 0) {
				System.out.print(linha--);
			} 
			else {
				System.out.print(" ");
			}
			int posicaoColuna = 0;
			for (int j = 0; j <= 10; j++) {				
				if (i % 2 != 0) {
					if (j == 3 || j == 7) {
						System.out.print("+");
					} 
					else {
						if (j == 10) {
							System.out.println("-");
						} else {
							System.out.print("-");
						}
					}
				} 
				else {
					if (j % 2 == 0) {
						System.out.print(" ");
					} else {
//						imprimirPeca(pecas[posicaoLinha][posicaoColuna++]);
						System.out.print("X");
						if(j == 9) {
							System.out.println(" ");
						}
						else {
							System.out.print(" |");
						}
						j += 2;
					}
				}
			}
			// a linha só é incrementada na linha onde os valores serão incrementados 
			if(i % 2 != 0) {
				posicaoLinha++;
			}
		}
		System.out.println("  a   b   c");
	}

	private static void imprimirPeca(PecaDoJogo peca) {
		if (peca == null) {
			System.out.print(" ");
		} else {
			System.out.print(peca);
		}
	}
}
