package TURMA24;

public class cliente {
	private String nomecliente;
	private String genero;
	private String idade;
	
	public cliente (String nomecliente, String genero, String idade) 
	{
		this.nomecliente = nomecliente;
		this.genero = genero;
		this.idade = idade; 
	}
	public cliente() {
		// TODO Auto-generated constructor stub
	}
	public void imprimirInfo () {
		System.out.println(nomecliente+genero+idade);
	}
	
	
	public String getNomecliente() {
		return nomecliente;
	}
	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
}
