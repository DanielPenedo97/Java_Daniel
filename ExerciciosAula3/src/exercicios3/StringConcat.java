package exercicios3;

import java.util.Scanner;

public class StringConcat {
	private static String pedeNome1(){
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite a String:");
		String string = sc.nextLine();
		return string;
	}
	private static String pedeNome2(){
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Digite a segunda String:");
		String string2 = sc2.nextLine();
		return string2;
	}
	
	public static void exibeNome(String nome1, String nome2) {
		System.out.println("A string 1 eh: "+ nome1+"\n"+"A string 2 eh: "+nome2);	
		System.out.println("As string concatenadas ficam: "+nome1+nome2);
	}
	public static void main(String[] args) {
		String nome1, nome2;
		nome1 = pedeNome1();
		nome2 = pedeNome2();
		exibeNome(nome1, nome2);
	}
}
