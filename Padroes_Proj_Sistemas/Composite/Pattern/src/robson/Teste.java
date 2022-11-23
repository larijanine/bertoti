package robson;

public class Teste {

	public static void main(String[] args) {

		Bloco bloco = new Bloco();
		Questao Q1 = new Questao();
		Questao Q2 = new Questao();
		Questao Q3 = new Questao();
		
		Q1.setDescricao("Questão 1");
		Q2.setDescricao("Questão 2");
		Q3.setDescricao("Questão 3");
		
		bloco.addElementoBasico(Q1);
		bloco.addElementoBasico(Q2);
		bloco.addElementoBasico(Q3);
		
		bloco.exibir();

	}

}
