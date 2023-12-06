package hospital;

public class AgenteSaude {
	private int cpf;
	private String nome;
	private String especialidade;
	
	//Construtor gerado pelo eclipse
	public AgenteSaude(int cpf, String nome, String especialidade) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.especialidade = especialidade;
	}
	public int getId() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	} 

    public void realizarAtendimento() {
        // Lógica para realizar um atendimento
    }

}
