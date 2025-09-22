package lab3;

public class Obra {
	
	//variáveis de instância
	private String titulo;
	private String autor;
	private int ano;
	
	//construtor
	public Obra(String titulo, String autor, int ano) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAno() {
		return ano;
	}

	@Override
	public String toString() {
		return "Obra [titulo=" + titulo + ", autor=" + autor + ", ano=" + ano + "]";
	}
	
	

}
