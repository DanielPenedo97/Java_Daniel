package hospital;

public class Medicamento {
    private int id;
    private String nome;
    private int quantidadeEmEstoque;
    
  //Construtor gerado pelo eclipse
	public Medicamento(int id, String nome, int quantidadeEmEstoque) {
		super();
		this.id = id;
		this.nome = nome;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}
	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
	
    public void atualizarEstoque() {
        // Lógica para atualizar o estoque de medicamentos
    }
}
