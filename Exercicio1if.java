package TURMA24;
import java.util.*;

public class Exercicio1if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0,num2=0,num3=0;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Entre com um valor um: ");
		num1 = ler.nextInt();
		System.out.println("Entre com um valor dois: ");
		num2 = ler.nextInt();
		System.out.println("Entre com um valor tres: ");
		num3 = ler.nextInt();
		
		if (num1>num2  && num1>num3)
		{
		System.out.println("o maior numero é "+ num1);
		}
		if (num2>num1 && num2>num2)
		{
		System.out.println("o maior numero é "+ num2);
		}
		if (num3>num1 && num3>num2)
		{
		System.out.println("o maior numero é "+ num3);
		}		
		
	}

}
