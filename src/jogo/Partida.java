package jogo;

import tabuleiro.Tabuleiro;

public class Partida {

	private Tabuleiro tabuleiro;
	
	public Partida() {
		tabuleiro = new Tabuleiro(3, 3);
	}
	
	public PecaDoJogo[][] getPecas() {
		PecaDoJogo[][] mat = new PecaDoJogo[tabuleiro.getLinha()][tabuleiro.getColuna()];
		for(int i = 0; i < tabuleiro.getLinha(); i ++) {
			for(int j = 0; j < tabuleiro.getColuna(); j ++) {
				mat[i][j] = (PecaDoJogo) tabuleiro.peca(i, j);
			}
		}
		return mat;
	}
}
