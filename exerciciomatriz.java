package TURMA24;

import java.util.Scanner;

public class exerciciomatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] numeros = new int [3][3];
		int maior=0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n Digite um numero ");
		
		for (int A=0; A<3; A++){
			for (int B=0; B<3; B++) {
									
				numeros [A][B] = leia.nextInt();			
					
				if (numeros [A][B]>10) {
					maior++;
					
				}
			}
			
		}
		System.out.println("Os numeros maiores que 10 são "+maior);
	}
}
