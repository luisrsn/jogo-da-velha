package application;

import java.util.Scanner;

import jogo.Partida;
import jogo.PecaDoJogo;
import jogo.PosicaoDoJogo;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Partida partida = new Partida();
		
		while(true) {
			//UI = User Interface
			UI.imprimirTabuleiro(partida.getPecas());
			System.out.println();
			System.out.print("Informe a peça que deseja jogar (X/O): ");
			String peca = sc.nextLine();
			System.out.print("Informe a posição: ");
			PosicaoDoJogo posicao = UI.lerPosicaoDoJogo(sc);
			
			partida.jogada(posicao.getColuna(), posicao.getLinha(), peca);
		}
	}
}
