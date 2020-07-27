package application;

import jogo.Partida;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

public class Program {

	public static void main(String[] args) {
		
		Partida partida = new Partida();
		//UI = User Interface
		UI.imprimirTabuleiro(partida.getPecas());
	}
}
