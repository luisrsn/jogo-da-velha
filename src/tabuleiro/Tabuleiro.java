package tabuleiro;

public class Tabuleiro {

	public Tabuleiro() {
		imprimirTabuleiro();
	}

	private void imprimirTabuleiro() {
		int linha = 3;
		for(int i = 1; i <= 5; i++) {
			if(i % 2 != 0) {
				System.out.print(linha--);
			}
			else {
				System.out.print(" ");
			}
			for(int j = 1; j <=11; j++) {
				if(i % 2 == 0) {
					if(j == 4 || j == 8) {
						System.out.print("+");
					}
					else {
						if(j == 11) {
							System.out.println("-");
						}
						else {
							System.out.print("-");
						}
					}
				}
				else {
					if(j == 4 || j == 8) {
						System.out.print("|");
					}
					else {
						if(j ==11) {
							System.out.println(" ");
						}
						else {
							System.out.print(" ");
						}
					}
				}
			}
		}
		System.out.println("  a   b   c");
	}
}
