package jogo;

import tabuleiro.Tabuleiro;

public class Partida {

	private Tabuleiro tabuleiro;
	
	public Partida() {
		tabuleiro = new Tabuleiro();
//		configuracaoInicial();
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
	
	private void lugarDaNovaPeca(char coluna, int linha, PecaDoJogo peca) {
		tabuleiro.colocarUmaPeca(peca, new PosicaoDoJogo(coluna, linha).paraAPosicao());
	}
	
//	private void configuracaoInicial() {
//		lugarDaNovaPeca('b', 1, new PecaDoJogo(tabuleiro, Valor.X));
//		lugarDaNovaPeca('a', 3, new PecaDoJogo(tabuleiro, Valor.O));
//	}
	
	public void jogada(char coluna, int linha, String peca) {
		//PecaDoJogo novaPeca = new PecaDoJogo(tabuleiro, Valor.valueOf(peca));
		lugarDaNovaPeca(coluna, linha, new PecaDoJogo(tabuleiro, Valor.valueOf(peca)));
		//return novaPeca;
	}
}
