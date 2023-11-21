package exercicios3;

import java.util.Scanner;

public class Temperatura1 {
	public static void fahrParCelsius() {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Digite a temperatura: ");
		float temperatura = myObj.nextFloat();
		float C = (temperatura-32) * 5/9;
		System.out.println("A temperatura em Celsius eh: "+ C);
	}
	
	public static void celsiusParFahr() {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Digite a temperatura: ");
		float temperatura = myObj.nextFloat();
		float F = (temperatura*9/5) + 32;
		System.out.println("A temperatura em Fahrenreit eh: "+ F);
	}
	
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Voce prefere convertar para Celsius(Digite 0) ou Fahrenreit(Digite 1)? ");
		int Op = myObj.nextInt();
		if (Op == 0)
			fahrParCelsius();
		else
			celsiusParFahr();
	}
}	
