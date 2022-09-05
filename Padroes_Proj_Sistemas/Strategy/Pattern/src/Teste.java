public class Teste {
    public static void main(String[] args) {
        
        Funcionario cargo = new Funcionario();
        cargo.setComissao(new Gerente());
        cargo.calcularComissao();

        System.out.println("--------------");

        cargo.setComissao(new Vendedor());
        cargo.calcularComissao();
        
    }
}