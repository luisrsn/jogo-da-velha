package jogo;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

public class Partida {

	private Tabuleiro tabuleiro;
	
	public Partida() {
		tabuleiro = new Tabuleiro();
		configuracaoInicial();
	}
	
	public PecaDoJogo[][] getPecas() {
		PecaDoJogo[][] mat = new PecaDoJogo[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i = 0; i < tabuleiro.getLinhas(); i ++) {
			for(int j = 0; j < tabuleiro.getColunas(); j ++) {
				mat[i][j] = (PecaDoJogo) tabuleiro.peca(i, j);
			}
		}
		return mat;
	}
	
	private void configuracaoInicial() {
		tabuleiro.colocarUmaPeca(new PecaDoJogo(tabuleiro, Valor.X), new Posicao(2, 1));
	}
}
