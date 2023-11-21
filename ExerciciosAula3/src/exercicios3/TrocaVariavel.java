package exercicios3;

import java.util.Scanner;

public class TrocaVariavel {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int x = myObj.nextInt();
		int y = myObj.nextInt();
		
		int aux = x;
		x = y; 
		y = aux;
		
		System.out.println("O valor de x agora eh: "+x +"\n" +"O valor de y agora eh: "+y);
	}
}
