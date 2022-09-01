public class TelaCelular implements Observer{
	
	public void update(double valor){
		
		display(valor);
		
	}
	
	public void display(double valor){
		
		System.out.println("Tela do Celular");
		System.out.println("Voce acaba com comprar a revista veja no valor de "+v);
	}

}