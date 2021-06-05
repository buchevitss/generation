package TURMA24;
import java.util.*;

public class repetição1exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1, n2, n3, media,mediageral, somamedia=0;
		
		Scanner jamelao = new Scanner (System.in);
		
		for (int x=1;x<=4;x++) 
		{
		System.out.println("Entre com a primeira nota: ");
		n1 = jamelao.nextFloat();
		System.out.println("Entre com a segunda nota: ");
		n2 = jamelao.nextFloat();
		System.out.println("Entre com a terceira nota: ");
		n3 = jamelao.nextFloat();
		
		media = (n1+n2+n3)/3;
		
		System.out.printf("Média do aluno: %2,2f", media);
		
		somamedia = somamedia + media;
		}
		
		mediageral = somamedia/4;
		System.out.printf("media dos alunos: %2,2f",mediageral);
	}

}
