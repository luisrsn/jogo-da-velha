package tabuleiro;

public class Tabuleiro {
	
	private int linhas = 3;
	private int colunas = 3;
	private Peca[][] pecas;
	
	public Tabuleiro() {
		pecas = new Peca[linhas][colunas];
	}		

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public Peca peca(int linha, int coluna) {
		if(!posicaoExistente(linha, coluna)) {
			throw new TabuleiroException("Posição não existente no jogo");
		}
		return pecas[linha][coluna];
	}
	
	public Peca peca(Posicao posicao) {
		if(!posicaoExistente(posicao)) {
			throw new TabuleiroException("Posição não existente no jogo");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}	
	
	public void colocarUmaPeca(Peca peca, Posicao posicao) {
		if(temUmaPeca(posicao)) {
			throw new TabuleiroException("Já existe uma peça na posicação " + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
	
	private boolean posicaoExistente(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}
	
	public boolean posicaoExistente(Posicao posicao) {
		return posicaoExistente(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean temUmaPeca(Posicao posicao) {
		if(!posicaoExistente(posicao)) {
			throw new TabuleiroException("Posição não existente no jogo");
		}
		return peca(posicao) != null;
	}
}
