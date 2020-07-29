package jogo;

import tabuleiro.TabuleiroException;

public class PartidaException extends TabuleiroException{
	private static final long serialVersionUID = 1L;

	public PartidaException(String msg) {
		super(msg);
	}
}
