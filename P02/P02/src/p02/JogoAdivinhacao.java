package p02;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
    	
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tente adivinhar o numero entre 1 e 100.");

        int tentativa;
        boolean acertou = false;

        while (!acertou) {
            System.out.print("Digite sua tentativa: ");
            tentativa = scanner.nextInt();

            if (tentativa < 1 || tentativa > 100) {
                System.out.println("Tentativa invalida, digite um numero entre 1 e 100");
            } else if (tentativa == numeroAleatorio) {
                acertou = true;
            } else if (tentativa < numeroAleatorio) {
                System.out.println("Muito baixo! Tente novamente.");
            } else {
                System.out.println("Muito alto! Tente novamente.");
            }
        }
        System.out.println("Voce acertou o numero " + numeroAleatorio);
    }
}
