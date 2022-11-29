import java.util.ArrayList;
import java.util.List;

public class Pagina {
	
	List<Texto> textos;
	List<Imagem> imagens;
	
	public Pagina() {
		textos = new ArrayList<>();
		imagens = new ArrayList<>();
	}
	
	public void addTexto(Texto texto) {
		textos.add(texto);
	}
	
	public void addImagem(Imagem imagem) {
		imagens.add(imagem);
	}
	

}
