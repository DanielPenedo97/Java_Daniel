package exercicios3;

import java.util.Scanner;

public class VerificarParidade {
	public static boolean verifPar(int x) {
		if (x%2 == 0)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int valor = myObj.nextInt();
		
		boolean resultado = verifPar(valor);
		
		if (resultado == true)
			System.out.println("O numero eh par");
		else
			System.out.println("O numero eh impar");
	}
}