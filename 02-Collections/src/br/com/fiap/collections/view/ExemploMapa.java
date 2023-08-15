package br.com.fiap.collections.view;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ExemploMapa {
    public static void main(String[] args){
        //Criar um mapa de estados
        HashMap<String, String> mapa = new HashMap<>();

        //Adicionar 3 estados no mapa
        mapa.put("SP", "São Paulo");
        mapa.put("BA", "Bahia");
        mapa.put("ES", "Espirito Santo");

        //Recuperar o valor da chave "BA"
        System.out.println(mapa.get("ES"));

        //Exibir a quantidade de elementos no mapa
        System.out.println(mapa.size());

        //Remover o SP
        mapa.remove("SP");
        mapa.put("ES", "Recife"); //Atualiza

        //Recuperar todas as chaves do mapa
        Set<String> chaves = mapa.keySet();

        //Exibir os dados com padrão "Nome Estado" (sigla)
        for (String item : chaves) {
            System.out.println(mapa.get(item) + "(" + item + ")");
        }


    }
}
