package antipattern;

public class Teste {

	public static void main(String[] args) {
		TelaCelular celular = new TelaCelular();
		TelaComputador computador = new TelaComputador();
		
		celular.MostrarTexto("Texto do celular");
		computador.MostrarTexto("Texto do computador");
		
	}

}

