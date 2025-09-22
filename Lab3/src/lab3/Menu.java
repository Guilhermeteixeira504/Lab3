package lab3;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Museu museu = new Museu();
		Scanner ler = new Scanner(System.in);
		int opcao=0;
		
		do {
			System.out.println("\n Menu:");
			System.out.println("1- Registar obra");
			System.out.println("2- Imprimir todos os detalhes de todas as obras");
			System.out.println("3- Pesquisar obra pelo título");
			System.out.println("4- Imprimir título e autor das pinturas a óleo com um determinado tipo de tela");
			System.out.println("5- Imprimir todos os detalhes de todas as obras de arte agrupadas por tipo");
			
			opcao = ler.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("Título da obra: ");
				String titulo = ler.next();
				System.out.println("Autor da obra: ");
				String autor = ler.next();
				System.out.println("Ano da obra: ");
				int ano = ler.nextInt();
				System.out.println("Tipo de obra (Pintura, Escultura): ");
				String tipo = ler.next();
				
				if(tipo.equalsIgnoreCase("Pintura")) {
					System.out.println("Técnica: ");
					String tecnica = ler.next();
					if(tecnica.equalsIgnoreCase("Óleo")) {
						System.out.println("Tipo de tela: ");
						String tipotela = ler.next();
						Obra obra1 = new PinturaOleo(titulo,autor, ano, tipotela);
						museu.registarObra(obra1);
					}
					else {
						Obra obra = new Pintura(titulo,autor,ano, tecnica);
						museu.registarObra(obra);
					}
				}
				else if(tipo.equalsIgnoreCase("Escultura")) {
					System.out.println("Material: ");
					String material = ler.next();
					Obra obra = new Escultura(titulo,autor,ano, material);
					museu.registarObra(obra);
				}
				else {
					System.out.println("Tipo de obra inválido");
				}
				
				break;
				
			case 2:
				museu.imprimirObras();
				break;
				
			case 3:
				System.out.println("Título da obra: ");
				String titulo1 = ler.next();
				museu.pesquisarTitulo(titulo1);
				break;
				
			case 4:
				System.out.println("Tipo de tela: ");
				String tipoTela = ler.next();
				museu.imprimirPorTipoTela(tipoTela);
				break;
				
			case 5:
				museu.imprimirPorTipo();
				break;
				
			case 0:
				System.out.println("Sair");
				break;
				
			default:
				System.out.println("Opção inváilda");
			}
		}
		while(opcao != 0);
	}
}
