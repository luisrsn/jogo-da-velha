package jogo;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

public class Partida {

	private Tabuleiro tabuleiro;
	
	public Partida() {
		tabuleiro = new Tabuleiro(3, 3);
		configuracaoInicial();
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
	
	private void configuracaoInicial() {
		tabuleiro.colocarPeca(new PecaDoJogo(tabuleiro, Valor.X), new Posicao(2, 1));
	}
}
