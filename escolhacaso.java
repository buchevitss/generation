package TURMA24;

import java.util.*;


public class escolhacaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Escolha o numero do mes");
		op = ler.nextInt();
		
		switch (op) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
			default:
				
			System.out.println("Não ha nenhum mes");
		}
		}
	}


