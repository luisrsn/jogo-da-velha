package jogo;

import tabuleiro.Posicao;

public class PosicaoDoJogo {

	private char coluna;
	private int linha;
	
	public PosicaoDoJogo(char coluna, int linha) {
		if(coluna < 'a' || coluna > 'c' || linha < 1 || linha > 3) {
			throw new PartidaException("Erro ao informar a posi��o da pe�a. Os valores v�lidos s�o de a1 at� c3");
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
		return "" + coluna + linha; //a String vazia "" � pra transformar as outras vari�veis em String
	}
}
