package TURMA24;

import java.util.Scanner;
import java.util.*;

public class Classe_Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1, n2, n3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("entre com a primeira nota: ");
		n1 = leia.nextFloat();
		System.out.println("entre com a segunda nota: ");
		n2 = leia.nextFloat();
		System.out.println("entre com a terceira nota: ");
		n3 = leia.nextFloat();
		
		media = (n1+n2+n3)/3;
		
		System.out.println("Média Aritmética: "+media);
		System.out.printf("Média aritmética arredondada, %2.2f",media);
		
		n1 = Math.sqrt(n2);
		n3 = Math.pow(n1, 3);
		media = n1 % n2;
	}



	

}
