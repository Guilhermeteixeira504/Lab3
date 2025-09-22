package lab3;

class Escultura extends Obra {
	
	private String material;

	public Escultura(String titulo, String autor, int ano, String material) {
		super(titulo, autor, ano);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	@Override
	public String toString() {
		return "Escultura:" + getTitulo() +", "+ getAutor() +", "+ getAno() +", "+ material;
	}
	
	

}
