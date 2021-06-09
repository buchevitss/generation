package TURMA24;

public class preguica extends ANIMAL{
	
	private String origem;

	public preguica(String nome, String idade, String origem) {
		super(nome, idade);
		 this.origem = origem;
		}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}
	
	public void imprimirInfo() {
		System.out.println("A preguiça se chama " +getNome()+ " e tem "+getIdade()+ " e veio da " +getOrigem() );
	}

}
