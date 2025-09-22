package lab3;

class PinturaOleo extends Pintura {
	
	private String tipotela;

	public PinturaOleo(String titulo, String autor, int ano, String tipotela) {
		super(titulo, autor, ano, "óleo");
		this.tipotela = tipotela;
	}

	public String getTipotela() {
		return tipotela;
	}

	@Override
	public String toString() {
		return "Pintura a óleo: "+ getTitulo() +", "+ getAutor() +", "+ getAno() +", "+ tipotela;
	}
	
	

}
