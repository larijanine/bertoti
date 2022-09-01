public class Teste {

	public static void main(String[] args) {
		
		BancaDeJornal b = new BancaDeJornal();
		TelaComputador tela = new TelaComputador();
		TelaCelular cel = new TelaCelular();
		b.registerObserver(tela);
		b.registerObserver(cel);
		
		Cliente pedro = new ClienteRevista(20, "Veja");
		
		pedro.valor = b.comprar(pedro, 17);
		
		
		
		
	}
}