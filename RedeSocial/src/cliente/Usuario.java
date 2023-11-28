package cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	private String nome, email, senha;
	private ArrayList<String> postagens;
	private int quantidadeDePostagens, pontuacao;
	
	public Usuario() {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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
}