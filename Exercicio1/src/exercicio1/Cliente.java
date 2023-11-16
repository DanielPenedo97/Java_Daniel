package exercicio1;

import java.util.Scanner;

public class Cliente {
	private String nome;
	private int idade, cpf;
	
	public Cliente(String nome, int cpf) {
		this.nome = nome;
		this.idade = 0;
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public void pegarNome() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do seu Cliente:");
		this.nome = sc.nextLine();
	}
	
	public void pegarCPF() {
		Scanner myInput = new Scanner(System.in);
		System.out.println("Digite o CPF do seu cliente:");
		this.cpf = myInput.nextInt();
	}
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente ("null", 0);
		cliente.pegarCPF();
		cliente.pegarNome();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        cliente.setIdade(idade);
		System.out.println("Cliente: "+ cliente.getNome()+ "\n"+ "CPF: "+ cliente.getCpf()+ "\n"+ "Idade: "+cliente.getIdade());
	}
}
