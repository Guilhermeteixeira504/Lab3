package lab3;

import java.util.ArrayList;

public class Museu {
	
	private ArrayList<Obra>obras;
	
	public Museu() {
		obras = new ArrayList<Obra>();
	}
	

	//registar obra
	public void registarObra(Obra obra) {
		for(Obra o : obras) {
			if(obra.getAutor().equalsIgnoreCase(obra.getTitulo()) && obra.getTitulo().equalsIgnoreCase(obra.getAutor())) {
				System.out.print("Já exite uma obra com este título e autor");
			}
		}
		obras.add(obra);
		
	}
	
	//imprimir detalhes de todas as obras
	public void imprimirObras() {
		for(Obra obra : obras) {
			System.out.println(obra);
		}
	}
	
	//pesquisar título
	public void pesquisarTitulo(String t) {
		for(Obra obra : obras) {
			if(obra.getTitulo().equalsIgnoreCase(t)) {
				System.out.println(obra);
			}
			else if(t != obra.getTitulo()) {
				System.out.println("Obra de arte não encontrada");
			}
		}
	}
	
	//imprimir o título e o autor das pinturas a óleo com um determinado tipo de tela
	public void imprimirPorTipoTela(String tipotela) {
		for(Obra obra : obras) {
			if(obra instanceof PinturaOleo) {
				PinturaOleo po = (PinturaOleo) obra;
				if(po.getTipotela().equalsIgnoreCase(tipotela)) {
					System.out.println("Título: "+po.getTitulo()+", Autor: "+po.getAutor());
				}
			}
		}
	}
	
	//Imprimir detalhes de todas as obras agrupadas por tipo, indicando o número total de cada tipo
	public void imprimirPorTipo() {
		int quant_p = 0;
		int quant_po = 0;
		int quant_e = 0;
		
		System.out.println("\n Pinturas: ");
		for(Obra obra : obras) {
			if(obra instanceof Pintura && !(obra instanceof PinturaOleo)) {
				System.out.println(obra);
				quant_p = quant_p + 1;
			}
		}
		System.out.println("Total de pinturas: " + quant_p);
		
		System.out.println("\n Pinturas a óleo: ");
		for(Obra obra : obras) {
			if(obra instanceof PinturaOleo) {
				System.out.println(obra);
				quant_po = quant_po + 1;
			}
		}
		System.out.println("Total de pinturas a óleo: " + quant_po);
		
		System.out.println("\n Escultura: ");
		for(Obra obra : obras) {
			if(obra instanceof Escultura) {
				System.out.println(obra);
				quant_e = quant_e + 1;
			}
		}
		System.out.println("Total de esculturas: " + quant_e);
	}
}
