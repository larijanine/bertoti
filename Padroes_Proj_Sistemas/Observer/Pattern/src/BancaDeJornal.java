package TesteObserver;

import java.util.ArrayList;

public class BancaDeJornal implements Subject {
	
	private ArrayList observers;
	private ClienteRevista c;
	
	public BancaDeJornal(){
		observers = new ArrayList();
	}
	
	public void registerObserver(Observer o){
		observers.add(o);
	}
	
	public void removeObserver(Observer o){
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers(double novoValor){
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(novoValor);
		}
	}
	
	public double comprar(ClienteRevista c, double dinheiro){
		
		c.valor = c.valor*0.8;
		
		notifyObservers(c.valor);
		return c.valor;
		
	}

}
