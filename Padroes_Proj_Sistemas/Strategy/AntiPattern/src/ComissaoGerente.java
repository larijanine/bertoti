package antipattern;

public class ComissaoGerente extends Comissao {
	@Override
	public double aplicarComissao(double valor) {
		return valor * 1.2;
	}
	
}
