package hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private List<Paciente> pacientes;
    private List<AgenteSaude> agentesSaude;
    private List<Atendimento> atendimentos;
    private List<Procedimento> procedimentos;
    private List<Medicamento> medicamentos;
    private List<Insumo> insumos;
    
    //Construtor principal
    public Hospital() {
        this.pacientes = new ArrayList<>();
        this.agentesSaude = new ArrayList<>();
        this.atendimentos = new ArrayList<>();
        this.procedimentos = new ArrayList<>();
        this.medicamentos = new ArrayList<>();
        this.insumos = new ArrayList<>();
    }

    // Método para cadastrar Pacientes
    public void cadastrarPaciente(Paciente paciente) {
        
    }

    // Método para cadastrar Agentes de Saúde
    public void cadastrarAgenteSaude(AgenteSaude agenteSaude) {
        
    }

    // Método para cadastrar Atendimentos
    public void registrarAtendimento(Atendimento atendimento) {
        
    }

    // Método para cadastrar Procedimentos
    public void agendarProcedimento(Procedimento procedimento) {
        
    }

    // Método para cadastrar Medicamentos
    public void cadastrarMedicamento(Medicamento medicamento) {
        
    }

    // Método para cadastrar Insumos
    public void cadastrarInsumo(Insumo insumo) {
        
    }
    
    //Metódo main para gerar um menu visual para o Usuário
    public static void main(String[] args) {
        
    }
}
