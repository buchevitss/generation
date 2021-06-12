package TURMA24;

import java.util.ArrayList;
import java.util.List;

public class ExercicioList {
	public static void main(String[]args) {
		
		ArrayList<String> mercadorias = new ArrayList<String>();
		
		mercadorias.add("Tenis");
		mercadorias.add("Chinelo");
		mercadorias.add("Salto Alto");
		mercadorias.add("Bota");
		mercadorias.remove(2);
		
		
		System.out.println(mercadorias.toString());
		
	}

}
