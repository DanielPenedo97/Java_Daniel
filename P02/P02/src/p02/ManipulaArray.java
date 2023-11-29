package p02;

import java.util.Scanner;
import java.util.Random;

public class ManipulaArray {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        int[] arrayUsuario = criarArrayDoUsuario(scanner);

        
        int[] arrayAleatorio = criarArrayAleatorio(5, 1, 100);

       
        System.out.println("Array lido do usuario: ");
        imprimirArray(arrayUsuario);

        System.out.println("\nArray aleatorio: ");
        imprimirArray(arrayAleatorio);

        
        int somaUsuario = calcularSoma(arrayUsuario);
        System.out.println("\nSoma do array lido do usuario: " + somaUsuario);
        
        int somaAleatorio = calcularSoma(arrayAleatorio);
        System.out.println("\nSoma do array lido aleatoriamente : " + somaAleatorio);
        
        int maiorValorUsuario = encontrarMaiorValor(arrayUsuario);
        int menorValorUsuario = encontrarMenorValor(arrayUsuario);

        System.out.println("\nMaior valor do array lido do usuario: " + maiorValorUsuario);
        System.out.println("Menor valor do array lido do usuario: " + menorValorUsuario);
        
        int maiorValorAleatorio = encontrarMaiorValor(arrayAleatorio);
        int menorValorAleatorio = encontrarMenorValor(arrayAleatorio);

        System.out.println("\nMaior valor do array lido do array Aleatorio: " + maiorValorAleatorio);
        System.out.println("Menor valor do array lido do array Aleatorio: " + menorValorAleatorio);
    }

    
    public static int[] criarArrayDoUsuario(Scanner scanner) {
        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

   
    public static int[] criarArrayAleatorio(int tamanho, int valorMinimo, int valorMaximo) {
        Random rand = new Random();
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = rand.nextInt(valorMaximo - valorMinimo + 1) + valorMinimo;
        }

        return array;
    }

    
    public static int calcularSoma(int[] array) {
        int soma = 0;
        for (int elemento : array) {
            soma += elemento;
        }
        return soma;
    }

    
    public static int encontrarMaiorValor(int[] array) {
        int maior = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }

    
    public static int encontrarMenorValor(int[] array) {
        int menor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }

   
    public static void imprimirArray(int[] array) {
        for (int elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
