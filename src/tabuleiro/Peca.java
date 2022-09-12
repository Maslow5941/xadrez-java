package tabuleiro;



public class Peca {
	
	protected Possicao possicao;
	private Borda borda;
	
	
	public Peca(Borda borda) {
		
		this.borda = borda;
		possicao = null;
	}


	protected Borda getBorda() {
		return borda;
	}




}
