package lab3;

class Pintura extends Obra {

	private String tecnica;

	public Pintura(String titulo, String autor, int ano, String tecnica) {
		super(titulo, autor, ano);
		this.tecnica = tecnica;
	}

	public String getTecnica() {
		return tecnica;
	}
	
	
}
