package TURMA24;

public class AUTOMOVEL {
	//declaração dos atributos(variaveis de instancia) da classe
	private String nomeProprietario;
	private String modelo;
	private String Placa; 
	private int ano;
	
	//metodo especial construtor 
	public AUTOMOVEL(String nomeProprietario, String modelo, String placa, int i) 
	{
		this.nomeProprietario = nomeProprietario;
		this.modelo = modelo;
		this.Placa = placa;
		this.ano = i;
	}
	
	//declaração dos demais metodos da classe 
	public void imprimirInfo() {
		System.out.println(nomeProprietario+"possui um "+modelo +"com placa"+Placa+"e ano: "+ano);
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		Placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
