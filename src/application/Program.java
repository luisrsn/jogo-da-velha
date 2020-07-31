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
		boolean primeiraJogada = true;
		boolean fimDaPartida = false;
		String peca = "";
		
		while(!fimDaPartida) {
			try {
				//UI = User Interface
				UI.limparTela();
				UI.imprimirTabuleiro(partida.getPecas());
				System.out.println();
				
				if(primeiraJogada) {
					System.out.print("Informe a peca que deseja jogar (X/O): ");
					peca = sc.nextLine();
					System.out.print("Informe a posicao: ");
					primeiraJogada = false;
				}
				else {
					System.out.print("Informe a posicao da peca " + peca + ": ");
				}
				
				PosicaoDoJogo posicao = UI.lerPosicaoDoJogo(sc);
				peca = partida.jogada(posicao.getColuna(), posicao.getLinha(), peca);
				fimDaPartida = partida.finalDaPartida();
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
		UI.limparTela();
		UI.imprimirTabuleiro(partida.getPecas());
		System.out.println();
		System.out.println();
		fimDaPartida = partida.finalDaPartida();
		System.out.println("Fim de jogo!");
	}
}
