package exercicios3;

import java.util.Scanner;

public class VerificaIdade {
	public static void main(String[] args) {
		Scanner myObj = new Scanner (System.in);
		System.out.println("Entre com o dia do seu nascimento");
		int dia = myObj.nextInt();
		System.out.println("Entre com o mes do seu nascimento(numeral)");
		int mes = myObj.nextInt();
		System.out.println("Entre com o ano do seu nascimento");
		int ano = myObj.nextInt();
		System.out.println("Entre com o dia de hoje");
		int diaAtual = myObj.nextInt();
		System.out.println("Entre com o mes atual(numeral)");
		int mesAtual = myObj.nextInt();
		System.out.println("Entre com o ano atual");
		int anoAtual = myObj.nextInt();
		
		if (mes < mesAtual) {
			int idade = anoAtual - ano;
			System.out.println("Voce tem: "+ idade);
		}
		else if (mes > mesAtual) {
			int idade = anoAtual - ano - 1;
			System.out.println("Voce tem: "+ idade);
		}
			else if (mes == mesAtual) {
				if (dia < diaAtual) {
					int idade = anoAtual - ano;
					System.out.println("Voce tem: "+ idade);
				}
				else if (dia > diaAtual) {
					int idade = anoAtual - ano - 1;
					System.out.println("Voce tem: "+ idade);
				}
					else {
						int idade = anoAtual - ano;
						System.out.println("Parabens eh seu aniversario e voce tem: "+ idade);
					}
			}
	}
}
