
public class Usuario {

	private int id;
	private String nome;
	
	public Usuario(String nome) {
		this(0, nome);
	}
	
	public Usuario(int id, String nome) {
		this.nome = nome;
		this.id = id;
		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getId() {
		return id;
	}
}
