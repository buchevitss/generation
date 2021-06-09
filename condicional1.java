package TURMA24;

import java.util.Scanner;
import java.util.*;

public class condicional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,somapositivo=0,somanegativo=0;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Entre com um valor: ");
		num = ler.nextInt();
		
		if (num>0)
		{

			System.out.println("Este numero é positivo");
		}
		else if (num<0) 
		{
			System.out.println("Este numero é negativo");
		}
		else
		{
			System.out.println("Este numero é o proprio 0");
		}
	}

}
