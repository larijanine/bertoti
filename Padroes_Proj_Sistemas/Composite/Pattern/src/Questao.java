public class Questao implements ElementoBasico{
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void exibir() {
		System.out.println(descricao);		
	}
	 

}
