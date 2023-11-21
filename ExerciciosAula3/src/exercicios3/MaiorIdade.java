package exercicios3;

import java.util.Scanner;

public class MaiorIdade {
	public static void main(String[] args) {
		Scanner myObj = new Scanner (System.in);
		int idade = myObj.nextInt();
		
		if(idade >= 18)
			System.out.println("Eh maior de idade");
		else
			System.out.println("Eh menor de idade");
	}
}
