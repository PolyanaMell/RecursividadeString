package view;

//importa classe que inverte a String
import Controller.StringController;

public class Principal {

	public static void main(String[] args) {
		//M�todo construtor
		StringController str = new StringController();
		//Inserindo os caracteres na vari�vel nome
		String nome = "Polyana Melissa";
		String saida = str.inverteString(nome, nome.length());
		System.out.println(saida);
		//sa�da do console
	}

}
