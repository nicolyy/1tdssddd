package br.com.fiap.exercicio2.classes.teste;
import br.com.fiap.exercicio2.classes.Data.*;
import java.util.Scanner;



	public class TestaData {
	    public static void main(String[] args) {
	        //Leitor
	        Scanner leitor = new Scanner(System.in);
	        
	        //Instanciando Data
	        Data data = new Data();
	        
	        //Entrada de dados
	        System.out.println("Favor, insira o dia.");
	        data.setDia(leitor.nextInt());
	        
	        System.out.println("Favor, insira o mês.");
	        data.setMes(leitor.nextInt());
	        
	        System.out.println("Favor, insira o ano");
	        data.setAno(leitor.nextInt());
	        
	        //Informando valores
	        
	        System.out.println("Dia: " + data.getDia() + " Mês: " + data.getMes() + " Ano: " + data.getAno());
	        
	        //Data formatada e nome do mes
	        
	        System.out.println("A data formatada é: " + data.retornarData());
	        data.mesNome();
	        
	        //fechando Scanner
	        leitor.close();

	    }

	}


