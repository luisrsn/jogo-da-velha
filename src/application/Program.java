package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import jogo.Partida;
import jogo.PartidaException;
import jogo.PecaDoJogo;
import jogo.PosicaoDoJogo;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import tabuleiro.TabuleiroException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Partida partida = new Partida();
		
		while(true) {
			try {
				//UI = User Interface
				UI.limparTela();
				UI.imprimirTabuleiro(partida.getPecas());
				System.out.println();
				System.out.print("Informe a peca que deseja jogar (X/O): ");
				String peca = sc.nextLine();
				System.out.print("Informe a posicao: ");
				PosicaoDoJogo posicao = UI.lerPosicaoDoJogo(sc);
				
				partida.jogada(posicao.getColuna(), posicao.getLinha(), peca);
			}
			catch(PartidaException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch(TabuleiroException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
	}
}
