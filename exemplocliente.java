package TURMA24;

public class exemplocliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cliente auto1 = new cliente("Julia"," feminino"," 23 anos");
		
		auto1.imprimirInfo();
		System.out.println("\n Novo cliente");
		auto1.setNomecliente(" Bruno");
		auto1.imprimirInfo();
	}

}
