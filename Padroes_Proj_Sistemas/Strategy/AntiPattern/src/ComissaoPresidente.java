public class ComissaoPresidente extends Comissao {
	@Override
	public double aplicarComissao(double valor) {
		return valor * 1.3;
	}
}
