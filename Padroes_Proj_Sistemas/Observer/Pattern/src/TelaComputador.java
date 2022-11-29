public class TelaComputador implements Observer {
	
	public void update(double valor){
			
			display(valor);
			
		}
		
		public void display(double v){
			
			System.out.println("Tela do Computador");
			System.out.println("Sua revista chegou  "+v);
		}

}
