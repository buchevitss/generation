package TURMA24;

public class ANIMAL {

	private String nome;
	private String idade;
	
	
	public ANIMAL (String nome, String idade)
	{
		super();
		this.nome = nome;
		this.idade = idade;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

}
