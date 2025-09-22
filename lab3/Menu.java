package lab3;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Museu museu = new Museu();
		Scanner ler = new Scanner(System.in);
		int opcao=0;
		
		do {
			System.out.println("Menu:");
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
				museu.registarObra(titulo, autor, ano);
				break;
				
			case 2:
				
				break;
				
			case 3:
				
				break;
				
			case 4:
				
				break;
				
			case 5:
				
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
