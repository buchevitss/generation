package TURMA24;

public class testeautomovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciando um objeto da classe automovel
		AUTOMOVEL auto1 = new AUTOMOVEL("Mara"," BMW"," XL92",2022);
		
		//troca de mensagens (chamada ao m�todo imprimirinfo())
		auto1.imprimirInfo();
		System.out.println("\n****** Transfe�ncia de propriet�rio ");
		auto1.setNomeProprietario(" Bruno");
		auto1.imprimirInfo();
		
		AUTOMOVEL auto2 = new AUTOMOVEL ("Denise","Toyota","KY85",2021);
		auto2.imprimirInfo();
		System.out.println("\n****Mudan�a de Placa****");
		auto2.setPlaca(" 1234");
		auto2.imprimirInfo();
		
	}

}
