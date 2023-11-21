package exercicios3;

import java.util.Scanner;

public class Temperatura2 {
	public static void converteTemp(float temp, int Op) {
		if (Op == 0) {
			float F = (temp*9/5) + 32;
			System.out.println("A temperatura em Fahrenreit eh: "+ F);
		}
		else {
			float C = (temp-32) * 5/9;
			System.out.println("A temperatura em Celsius eh: "+ C);
		}
	}
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Voce prefere convertar para Celsius(Digite 0) ou Fahrenreit(Digite 1)? ");
		int Op = myObj.nextInt();
		System.out.println("Digite a temperatura: ");
		float temperatura = myObj.nextFloat();
		converteTemp(temperatura, Op);
	}
}
