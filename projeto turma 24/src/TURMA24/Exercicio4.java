package TURMA24;
import java.util.*;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	byte A, B, C;
	double D;
	double R,S;
	
	Scanner leia = new Scanner(System.in);
	
		System.out.println("Entre com o numero de A");
		A = leia.nextByte();
		System.out.println("Entre com o numero de B");
		B = leia.nextByte();
		System.out.println("Entre com o numero de C");
		C = leia.nextByte();
		System.out.println("Entre com o numero de D");
	
		
		R = Math.sqrt(A+B);
		S = Math.sqrt(B+C);
		
		D = (R+S)/2;
		
		
		System.out.printf("O valor de D é: %2.2f",D);
		

		
		
		
		
		
	}

}
