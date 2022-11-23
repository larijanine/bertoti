package robson;

import java.util.ArrayList;
import java.util.List;

public class Bloco implements ElementoBasico{
	
	 private List<ElementoBasico> questoesList;
	 private String descricao;
	 
	 public Bloco() {
		 questoesList = new ArrayList<>();
	 }

	public List<ElementoBasico> getElementos() {
		return questoesList;
	}

	public void setElementos(List<ElementoBasico> questoesList) {
		this.questoesList = questoesList;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void exibir() {
		for (ElementoBasico item : questoesList) {
			item.exibir();
		}
		
	}
	
	public void addElementoBasico(ElementoBasico item) {
		questoesList.add(item);
	}
	
	public void removeElementoBasico(ElementoBasico item) {
		questoesList.remove(item);
	}
	    

}
