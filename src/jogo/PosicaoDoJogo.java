package jogo;

import tabuleiro.Posicao;

public class PosicaoDoJogo {

	private char coluna;
	private int linha;
	
	public PosicaoDoJogo(char coluna, int linha) {
		if(coluna < 'a' || coluna > 'c' || linha < 1 || linha > 3) {
			throw new PartidaException("Erro ao informar a posição da peça. Os valores válidos são de a1 até c3");
		}
		this.coluna = coluna;
		this.linha = linha;
	}

	public char getColuna() {
		return coluna;
	}

	public int getLinha() {
		return linha;
	}
	
	protected Posicao paraAPosicao() {
		return new Posicao(3 - linha, coluna - 'a');
	}
	
	protected static PosicaoDoJogo daPosicao(Posicao posicao) {
		return new PosicaoDoJogo((char)('a' - posicao.getColuna()), 3 - posicao.getLinha());
	}
	
	@Override
	public String toString() {
		return "" + coluna + linha; //a String vazia "" é pra transformar as outras variáveis em String
	}
}
