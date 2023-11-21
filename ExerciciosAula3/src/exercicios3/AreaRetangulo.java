package exercicios3;

import java.util.Scanner;

public class AreaRetangulo {
	public static void calculaArea(int largura, int altura) {
		float area = largura*altura;
		System.out.println("A area do retangulo eh: "+area+"m²");
	}
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int largura = myObj.nextInt();
		int altura = myObj.nextInt();
		calculaArea(largura, altura);
	}
}
