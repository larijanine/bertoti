public class Funcionario {

    private Comissao comissao;

    public void setComissao (Comissao comissao) {
        this.comissao = comissao;
    }

    public void calcularComissao() {
        this.comissao.calcular();
    }
}