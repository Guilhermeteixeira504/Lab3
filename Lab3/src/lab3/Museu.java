package lab3;

import java.util.ArrayList;

public class Museu {
	
	private ArrayList<Obra>obras;
	
	public Museu() {
		obras = new ArrayList<Obra>();
	}
	
	//pesquisar título
	public Obra pesquisarTitulo(String t) {
		for(Obra obra : obras) {
			if(obra.getTitulo().equalsIgnoreCase(t)) {
				return obra;
			}
		}
		return null;
	}
	
	//pesquisar obra
	public Obra pesquisarObra(String t, String a) {
		for(Obra obra : obras) {
			if(obra.getAutor().equalsIgnoreCase(a)) {
				if(obra.getTitulo().equalsIgnoreCase(t)) {
					return obra;
				}
			}
		}
		return null;
	}

	public void registarObra(String titulo, String autor, int ano) {
		if(pesquisarObra(titulo,autor) != null) {
			System.out.println("Já exite uma obra com esse título e autor");
		}
		else {
			Obra obra = new Obra(titulo, autor, ano);
			obras.add(obra);
		}
	}
}
