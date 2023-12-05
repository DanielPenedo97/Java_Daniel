package hospital;

public class Procedimento {
    private int id;
	private String descricao;
	
	//Construtor gerado pelo eclipse
    public Procedimento(int id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

    public void realizarProcedimento() {
        // Lógica para realizar um procedimento
    }
}

