package hospital;

public class Atendimento {
	    private int id;
	    private String tipo;
	    private boolean urgencia;
	    private Paciente paciente;
	    private AgenteSaude medicoResponsavel;
	    
	  //Construtor gerado pelo eclipse
		public Atendimento(int id, String tipo, boolean urgencia, Paciente paciente, AgenteSaude medicoResponsavel) {
			super();
			this.id = id;
			this.tipo = tipo;
			this.urgencia = urgencia;
			this.paciente = paciente;
			this.medicoResponsavel = medicoResponsavel;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public boolean isUrgencia() {
			return urgencia;
		}
		public void setUrgencia(boolean urgencia) {
			this.urgencia = urgencia;
		}
		public Paciente getPaciente() {
			return paciente;
		}
		public void setPaciente(Paciente paciente) {
			this.paciente = paciente;
		}
		public AgenteSaude getMedicoResponsavel() {
			return medicoResponsavel;
		}
		public void setMedicoResponsavel(AgenteSaude medicoResponsavel) {
			this.medicoResponsavel = medicoResponsavel;
		}
		
	    public void direcionarMedico() {
	        // Lógica para direcionar um médico ao atendimento
	    }

	    public Paciente consultarPaciente() {
	        // Lógica para consultar informações do paciente
	        return new Paciente(1, "exemplo", 1);
	    }
}
