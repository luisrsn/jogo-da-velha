package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import jogo.PecaDoJogo;
import jogo.PosicaoDoJogo;

public class UI {
	
	public static PosicaoDoJogo lerPosicaoDoJogo(Scanner sc) {
		try {
			String s = sc.nextLine();
			char coluna = s.charAt(0);
			int linha = Integer.parseInt(s.substring(1));
			return new PosicaoDoJogo(coluna, linha);
		}
		catch (RuntimeException e) {
			throw new InputMismatchException("Erro ao ler a posicao da peca. Valores validos de a1 ate c3");
		}
	}
	
	public static void limparTela() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
	
	private static void imprimirPeca(PecaDoJogo peca) {
		if (peca == null) {
			System.out.print(" ");
		} else {
			System.out.print(peca);
		}
	}

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
						imprimirPeca(pecas[posicaoLinha][posicaoColuna++]);
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
}
