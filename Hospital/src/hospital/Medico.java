package hospital;

public class Medico extends AgenteSaude {
	private String crm;
	
	//Construtor gerado pelo eclipse
	public Medico(int cpf, String nome, String especialidade) {
		super(cpf, nome, especialidade);
		this.crm = crm;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}
	
}
