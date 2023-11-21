package exercicios3;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um numero inteiro: ");
		int x = entrada.nextInt();
		System.out.println("Digite outro numero inteiro: ");		
		int y = entrada.nextInt();
		System.out.println("Escolha uma operacao: \n A: Adicao\n S: Subtracao\n M: Multiplicacao\n D: Divisao");
		char operacao = entrada.next().charAt(0);
		switch (operacao) {
		case 'A': {
			System.out.println("Resultado da soma eh: "+ (x+y));
			break;
		}
		case 'S': {
			System.out.println("Resultado da subtracao eh: "+ (x-y));
			break;
		}
		case 'M': {
			System.out.println("Resultado da multiplicacao eh: "+ (x*y));
			break;
		}
		case 'D': {
			System.out.println("Resultado da divisao eh: "+ (x/y));
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + operacao);
		}
	}
}
