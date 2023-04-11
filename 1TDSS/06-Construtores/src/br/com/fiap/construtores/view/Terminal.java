package br.com.fiap.construtores.view;
import br.com.fiap.construtores.model.Bicicleta;
import br.com.fiap.construtores.model.Fabricante;

public class Terminal {
	
	public static void main(String [] args ) {
		
		
		//Instanciar um fabricante
		
		Fabricante fab = new Fabricante();
	
		
		//Setar os dados do Fabricante
		
		fab.setCnpj("12.098.890/0001-56");
		fab.setNome("nickisbike");
		
		//Instanciar uma Bicicleta
		
		Bicicleta bike = new Bicicleta();
		
		//Setar os dados da Bicicleta 
		bike.setAro(29);
		bike.setFabricante(fab);
		bike.setModelo("Velox");
		bike.setPeso(0);
		
	
		//Exibir os dados da Bicicleta
		//Get eu uso para exibir
		//String eu uso o return declarado na outra class
		
		String dados = bike.retornarDetalhes();
		System.out.println(dados)
		
		//Exibir os dados do fabricante
		
		System.out.println(bike.getFabricante().getNome());
		
		(bicicleta.getAro() + ""
		+ bicicleta.getModelo() + "" + bicicleta.getPeso() + ""
		+ bicicleta.getClass() + "" + bicicleta.getFabricante() +"");
	}
	
	//desafio para amanha, implementar um construtor na class bicicleta
	//que recebe todos os atributos

}
