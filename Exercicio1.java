package TURMA24;

import java.util.*;
 


public class Exercicio1 {
	public static void main(String[] args) {
	
 double dias, meses, anos,idade;
 
 Scanner leia = new Scanner(System.in);
 
 	System.out.println("Entre com o numero de anos");
 	anos = leia.nextDouble();
 	System.out.println("Entre com o numero de meses");
 	meses = leia.nextDouble();
 	System.out.println("Entre com o numero de dias");
 	dias = leia.nextDouble();
 	
 	anos= (anos*365);
 	meses= (meses*30);
 	
 	idade = anos+meses+dias;
 	
 	System.out.println(idade);
 	
 	
 	
 	
 	
 	
 			
}
}