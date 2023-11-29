package p02;

import java.util.Scanner;

public class Conversor {
		
	public static double converte(double x, double y) {
			return x*y;
	}
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanto voce quer converter em Dolares: ");
		double dol = myObj.nextDouble();
		System.out.println("Quer em Euro ou Real? ");
		String Op = sc.nextLine();
		switch (Op) {
			case "Euro": {
				System.out.println("Digite a taxa de cambio: ");
				double taxa = myObj.nextDouble();
				double valorTotal = converte(dol, taxa);
				System.out.println("O valor resgatado eh de: "+ valorTotal);
				break;
			}
			case "Real":{
				System.out.println("Digite a taxa de cambio: ");
				double taxa = myObj.nextDouble();
				double valorTotal = converte(dol, taxa);
				System.out.println("O valor resgatado eh de: "+ valorTotal);
				break;
			}
			default:{
				System.out.println("Voce digitou errado, tente novamente: ");
				break;
			}
		}
	}
}

