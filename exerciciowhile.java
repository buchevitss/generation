package TURMA24;

import java.util.Scanner;

public class exerciciowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner liza = new Scanner (System.in);
		int x=0,caralho=0,cacete=0;
		
		System.out.println("Insira aqui sua idade: ");
		x = liza.nextInt();
		
			while (x!=-99) {
			
			if (x>0 && x<21) {
				caralho++;
			}
			else if (x>50) {
				cacete++;
			}
			System.out.println("Insira aqui sua idade: ");
			x = liza.nextInt();
			
					}
			System.out.println("a quantidade de pessoas com até 21 anos é "+ caralho);
			System.out.println("a quantidade de pessoas com mais de 50 é  "+ cacete);
	}

}
