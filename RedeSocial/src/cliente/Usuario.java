package cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	private String nome, email, nacionalidade;
	private ArrayList<String> postagens;
	private int quantidadeDePostagens, pontuacao;
	
	public Usuario() {
		this.nome = nome;
		this.email = email;
		this.nacionalidade = nacionalidade;
		postagens = new ArrayList<String>();
		this.quantidadeDePostagens = 0;
		this.pontuacao = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public int getQuantidadeDePostagens() {
		return quantidadeDePostagens;
	}

	public void setQuantidadeDePostagens(int quantidadeDePostagens) {
		this.quantidadeDePostagens = quantidadeDePostagens;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public void adicionaPostagem(String post) {
		String postagem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua postagem:");
		postagem = sc.nextLine();
		quantidadeDePostagens++;
	}
	
	public void alteraPontuacao(int delta) {
	
	}
	
	public static void main(String[] args) {
		Usuario U1 = new Usuario();
		String nome, email, nacionalidade;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Digite o nome do seu Usuario:");
		nome = sc1.nextLine();
		U1.setNome(nome);
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Digite o email do seu Usuario:");
		email = sc2.nextLine();
		U1.setEmail(email);
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Digite a nacionalidade do seu Usuario:");
		nacionalidade = sc3.nextLine();
		U1.setNacionalidade(nacionalidade);
		
		String postagem = "";
		U1.adicionaPostagem(postagem);
		System.out.println("Usuario: "+ U1.getNome()+ "\n"+ "Email: "+ U1.getEmail()+ "\n"+ "Nacionalidade: "+ U1.getNacionalidade()+"\n");
		System.out.println("Quantidade de postagens: "+ U1.getQuantidadeDePostagens());
	}
}
