//Crie uma classe Filme que contém os atributos título, duração em minutos e gênero.
//Essa classe deve encapsular e validar todos os atributos.

package models;

/* A classe Filme tem o objetivo de criar um filme
 * a partir dos artributos que a compõem.
 * 
 * @author taynara
 * @version 1.0
 */

public class Filme {
	//declarando os atributos
	private String titulo;
	private int duracao;
	private Genero genero;
	
	// Getter que retorna título
	public String getTitulo() {
		return titulo;
	}
	
	// Excepção que valida se título estiver vazio.
	// Construtor do atributo titulo
	public void setTitulo(String titulo) throws Exception {
		if(titulo == null || titulo.trim().isEmpty()) {
			throw new Exception("O título é obrigatório.");
		} else {
			this.titulo = titulo;
		}
	}
	
	// Getter que retorna duração do filme.
	public int getDuracao() {
		return duracao;
	}
	
	// Excepção que valida se a duração for menor que 0.
	// Construtor do atributo duração
	public void setDuracao(int duracao) throws Exception {
		if(duracao < 0) {
			throw new Exception("A duração tem que ser maior que zero.");
		} else {
			this.duracao = duracao;
		}
	}
	
	//Utilizar enum para citar categorias de filme.
	public enum Genero {
		Romance, Terror, Comédia
	}
	
	//Getter retorna genero
	public Genero getGenero() {
		return genero;
	}
	
	//Construtor do atributo genero
	public Genero setGenero(Genero genero) {
		return
			this.genero = genero;
	}
}
	

