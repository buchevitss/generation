package TURMA24;
import java.io.InputStream;
import java.util.*;

public class exercicio3op {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int idade=0;
	
	Scanner leia = new Scanner (System.in);
	System.out.println("Entre com a sua idade");
	idade = leia.nextInt();
	
	if (idade>10 && idade<=14)
	{
	System.out.println("O seu grupo � o infantil");
	}
	else if (idade>=15 && idade<=17)
	{
	System.out.println("O seu grupo � o juvenil");
	}
	else if (idade>=18 && idade<=25)
	{
	System.out.println("O seu grupo � adulto");
	}
	else 
	{
		System.out.println("Idade inv�lida");
	}
	
	
	
	}

}
