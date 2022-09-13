package TesteObserver;

public class TelaCelular implements Observer {
	
	public void update(double valor){
			
			display(valor);
			
		}
		
		public void display(double v){
			
			System.out.println("Tela do Celular");
			System.out.println("Voce acaba de comprar a revista por "+v);
		}

}
