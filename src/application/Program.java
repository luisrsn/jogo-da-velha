package application;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

public class Program {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro();
		
		Posicao pos = new Posicao(3, 4);
		System.out.println(pos);
	}
}
