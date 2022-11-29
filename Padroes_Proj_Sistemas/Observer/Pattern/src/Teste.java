public class Teste {

public static void main(String[] args) {
		
		BancaDeJornal b = new BancaDeJornal();
		TelaComputador tela = new TelaComputador();
		TelaCelular cel = new TelaCelular();
		b.registerObserver(tela);
		b.registerObserver(cel);
		
		ClienteRevista marilia = new ClienteRevista(20.0, "Veja");
		
		marilia.valor = b.comprar(marilia, 20.0);
		
		
}

}
