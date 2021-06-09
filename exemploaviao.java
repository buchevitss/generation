package TURMA24;

public class exemploaviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AVIAO auto1 = new AVIAO (" \nCongonhas"," Londres", " 18:00");
	
		auto1.imprimirInfo();
		System.out.println("\n****** Novo voo ");
		auto1.setAeroporto("Guarulhos");
		auto1.imprimirInfo();
		
		AVIAO auto2 = new AVIAO ("Viracopos","Dublin","21:00");
		auto2.imprimirInfo();
		
	}

}
