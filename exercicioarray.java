package TURMA24;

import java.util.Scanner;

public class exercicioarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
		int soma=0;
		int [] notas = new int [7];
	      notas [0] = 1;
	      notas [1] = 0;
	      notas [2] = 5;
	      notas [3] = -2;
	      notas [4] = -5;
	      notas [5] = 7;
	      
	      soma = (soma = notas[0]+notas[1]+notas[5]);
	      
	      System.out.println("a soma dos valores é "+soma);
	      
	     notas[4] = 100;
	     
	     System.out.println("\n o valor é "+notas[0]);
	     System.out.println("\n o valor é "+notas[1]);
	     System.out.println("\n o valor é "+notas[2]);
	     System.out.println("\n o valor é "+notas[3]);
	     System.out.println("\n o valor é "+notas[4]);
	     System.out.println("\n o valor é "+notas[5]);
	    
	      
	      
	      
	      
	      
	      
	      
		
		
	}

}
