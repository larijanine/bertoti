public class TelaComútador implements Observer{
	
	public void update(double valor){
		
		display(valor);
		
	}
	
	public void display(double v){
		
		System.out.println("Tela do Computador");
		System.out.println("Chegou a revista veja no valor de "+v);
	}

}