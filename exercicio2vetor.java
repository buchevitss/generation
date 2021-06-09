package TURMA24;

import java.util.Scanner;

public class exercicio2vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[3];
		int somapares = 0, impar = 0, x;

		Scanner leia = new Scanner(System.in);

		for (x = 0; x < num.length; x++) {

			System.out.println("Digite um numero");
			num[x] = leia.nextInt();

			if (num[x] % 2 == 0) {
				somapares = somapares + num[x];

				System.out.println("A soma dos numeros pares é " + somapares);
			} else {
				impar++;

				System.out.println("a quantidade de numeros impares é " + impar);
			}
		}

		for (x = 0; x < num.length; x++) {
			if (num[x] % 2 == 0) {

				System.out.println(num[x] + " é par");
			} else {
				System.out.println(num[x] + " é impar");
			}
		}

	}
}
