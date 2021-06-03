package TURMA24;
import java.util.*;

public class Exercicio8 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double valor, distribuidor,imposto;
		double total;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o valor do carro");
		valor = leia.nextByte();
		
		imposto = (valor*0.45);
		distribuidor = (valor*0.28);
		total = (imposto+distribuidor);
				
						
		System.out.println(total);
		total = leia.nextByte();
		
	}
	

}
