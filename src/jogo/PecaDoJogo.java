package jogo;

import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

public class PecaDoJogo extends Peca{

	private Valor valor;

	public PecaDoJogo(Tabuleiro tabuleiro, Valor valor) {
		super(tabuleiro);
		this.valor = valor;
	}

	public Valor getValor() {
		return valor;
	}	
	
	@Override
	public String toString() {
		return valor.toString();
	}
}
