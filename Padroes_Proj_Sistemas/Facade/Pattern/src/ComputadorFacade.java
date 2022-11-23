
public class ComputadorFacade {
	
	private Computador computador;
    private Memoria memoria;
    private DiscoRigido discoRigido;

    public ComputadorFacade() {
        this.computador = new Computador();
        this.memoria = new Memoria();
        this.discoRigido = new DiscoRigido();
    }

    public void run() {
        computador.processaDado();
        memoria.carregaDado();
        discoRigido.leDado();
    }

}
