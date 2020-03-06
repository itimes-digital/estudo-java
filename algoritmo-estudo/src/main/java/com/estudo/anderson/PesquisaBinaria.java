package com.estudo.anderson;

import java.util.Arrays;
import java.util.List;

public class PesquisaBinaria {

	public static void main(String[] args) {
		
		String minha_lista [] = {"Aaron","Abel","Abelardo","Abigail","Abílio","Abner",
		   			"Abraão","Abrahão","Abrão","Ada","Adalberto","Adalgisa",
		   			"Adam","Adão","Adauto","Adela","Adelaide","Adelberto",
		   			"Adèle","Adélia","Adelina","Ademar","Adhemar","Adolfo",
		   			"Adolpho","Adoniram","Adônis","Adrian","Adriana","Adriane",
		   			"Adrianne","Adriano","Adriel","Adriene","Adrienne","Afif",
		   			"Afonso","Ágata","Agatha","Agenor","Agnaldo","Agnes","Agostinho",
		   			"Aguinaldo","Aída","Aiko","Aílton","Aimar","Aimée","Airton",
		   			"Ajit","Akahana","Akako","Akiva","Alaíde","Alan","Alana",
		   			"Alane","Alanna","Alanne","Alba","Alberta","Albertina",
		   			"Alberto","Alceu","Alcides","Alcione","Alcyone","Alda",
		   			"Aldaberto","Aldine","Aldo","Alec","Alecsandra","Alegra",
		   			"Alejandra","Aleksandra","Alessandra","Alessandro","Alex",
		   			"Alexa","Alexandra","Alexandre","Aléxis","Alfonso","Alfredo",
		   			"Ali","Alice","Alicia","Aline","Alisha","Alissa","Allegra",
		   			"Alma","Aloísio","Alonso","Aluísio","Álvaro","Alzira","Amadeu",
		   			"Amadeus","Amaia","Amália","Amanda","Amar","Amara",
		   			"Amarílis","Amauri","Amaury","Amedeo","Amélia","Amélie",
		   			"América","Américo","Amílcar","Amir","Amisha","Amita",
		   			"Amiti","Amos","Amy","Ana","Anabela","Anahy","Tina Turner",
		   			"Koko Taylor", "Big Mama Thorton", "Laverna Baker", "Madonna",
		   			"James Brown", "Billie Holliday", "B.B King"};
		
		List<String> asList = Arrays.asList(minha_lista);
		asList.sort((a, b) -> a.compareTo(b));
		
		Object posicao = pesquisa_binaria(asList.toArray(), "B.B King");
		System.out.println(posicao
				+ " é a posição para o nome : " +  (posicao instanceof Integer ? asList.get((Integer)posicao) : "" ));

	}
	
	private static Object pesquisa_binaria(Object lista [], String item) {
		int baixo = 0;
		int alto = lista.length - 1;

		while (baixo <= alto) {
			
			int meio = (baixo + alto) / 2;

			String chute = String.valueOf(lista[meio]);
			if (chute.equals(item)){
				return meio;
			}
			if (chute.compareTo(item) > 0) {
				alto = meio - 1;
			}else {
				baixo = meio + 1;
			}
		}
		return "Não encontrado...";
	}
}
