package hospital;

public class Paciente {
    private int cpf;
    private String nome;
    private int idade;
    
    //Construtor gerado pelo eclipse
	public Paciente(int cpf, String nome, int idade) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
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
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

    public String consultarHistoricoMedico() {
        // Lógica para consultar o histórico médico do paciente
        return "Histórico médico do paciente";
    }

    public void realizarTriagem() {
        // Lógica para realizar a triagem do paciente
    }   
}
