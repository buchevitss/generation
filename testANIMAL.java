package TURMA24;

public class testANIMAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		preguica bicho = new preguica("Leo", "45 anos", "Santo Andr�");
		cachorro bicho2 = new cachorro("Cristal", "2 anos", "Canga�ba");
		
		
		bicho.imprimirInfo();
		
		
		bicho.setNome("Silva");
		
		System.out.println("\nO nome do bicho foi alterado");
		
		bicho.imprimirInfo();
		
		
		
	}

	
}
