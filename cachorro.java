package TURMA24;

public class cachorro extends ANIMAL {

	private String cor;

	public cachorro(String nome, String idade, String cor) {
		
		super(nome, idade);
		this.cor = cor;
			}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void imprimirInfo () {
		System.out.println("O cachorro se chama "+getNome()+" e tem "+getIdade()+
				" e é da cor "+getCor());
	}

}

