public class Teste {

	public static void main(String[] args) {
		Computador computador = new Computador();
		
		Memoria memoria = new Memoria();
		Cpu cpu = new Cpu();
		Monitor monitor = new Monitor();
		
		computador.setMemoria(memoria);
		computador.setCpu(cpu);
		computador.setMonitor(monitor);
		
		computador.getMemoria().iniciarMemoria();
		computador.getCpu().iniciarCpu();
		computador.getMonitor().iniciarMonitor();

	}

}
