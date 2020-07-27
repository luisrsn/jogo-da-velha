package tabuleiro;

public class Peca {

	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posicao = null; // nao precisaria declarar pois a variavel inicializada ja eh nula
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
	
}
