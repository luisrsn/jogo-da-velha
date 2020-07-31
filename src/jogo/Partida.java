package jogo;

import tabuleiro.Tabuleiro;

public class Partida {

	private Tabuleiro tabuleiro;
	private int interacoes = 0;
	
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
		interacoes++;
	}
	
	public String jogada(char coluna, int linha, String peca) {
		peca = peca.toUpperCase();
		lugarDaNovaPeca(coluna, linha, new PecaDoJogo(tabuleiro, Valor.valueOf(peca)));
		return peca.equals("X")? "O" : "X";
	}
	
	public boolean finalDaPartida() {
		
		if(temGanhador("X")) {
			System.out.println("'X' ganhou");
			return true;
		}
		else if(temGanhador("O")) {
			System.out.println("'O' ganhou");
			return true;
		}
		else if(interacoes == 9) {
			System.out.println("Ninguem ganhou!");
			return true;
		}
		
		return false;
	}
	private boolean temGanhador(String valor) {		
		int cont = 0;
		PecaDoJogo[][] mat = getPecas();
		
		// Posicao 1 - Verifica todas as linhas		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				if(mat[i][j] != null) {
					if(mat[i][j].toString().equals(valor)) {
						cont++;
					}					
				}
			}
			if(cont==3) {
				return true;
			}
			else {
				cont=0;
			}
		}
		
		// Posicao 2 - Verifica todas as colunas
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				if(mat[j][i] != null) {
					if(mat[j][i].toString().equals(valor)) {
						cont++;
					}
				}
			}
			if(cont==3) {
				return true;
			}
			else {
				cont=0;
			}
		}
		
		//Posicao 3 - Verifica a primeira diagonal
		for(int j = 0; j < mat.length; j++) {
			if(mat[j][j] != null) {
				if(mat[j][j].toString().equals(valor)) {
					cont++;
				}
			}
		}
		if(cont==3) {
			return true;
		}
		else {
			cont=0;
		}
		
		//Posicao 4 - Verifica a segunda diagonal
		int j = mat.length; 
		j--; // pois o valor da posicao da matriz eh menor
		for(int i = 0; i < mat.length; i++) {
			if(mat[i][j] != null) {
				if(mat[i][j].toString().equals(valor)) {
					cont++;
				}
			}
			j--;
		}
//		for(int j = mat.length; j >= 0; j--) {
//			j--; // pois o valor da posicao da matriz eh menor
//			if(mat[j][j] != null) {
//				if(mat[j][j].toString().equals(valor)) {
//					cont++;
//				}
//			}
//		}
		if(cont==3) {
			return true;
		}
				
		return false;
	}
	
//	private void configuracaoInicial() {
//	lugarDaNovaPeca('b', 1, new PecaDoJogo(tabuleiro, Valor.X));
//	lugarDaNovaPeca('a', 3, new PecaDoJogo(tabuleiro, Valor.O));
//}
}
