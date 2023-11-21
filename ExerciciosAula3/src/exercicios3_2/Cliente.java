package exercicios3_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Cliente {
    private String nome;
    private String sobrenome;
    private Date dataNascimento;

    public Cliente(String nome, String sobrenome, String dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.setDataNascimento(dataNascimento);
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            this.dataNascimento = formato.parse(dataNascimento);
        } catch (ParseException e) {
            System.out.println("Erro ao parsear a data de nascimento.");
            e.printStackTrace();
        }
    }

    public String mostrarDataNascimento() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(this.dataNascimento);
    }
    
    public String mostrarNomeSobrenome() {
    	return this.nome+" "+this.sobrenome;
    }

    public int calcularIdade() {
        Date dataAtual = new Date();
        long diferencaMillis = dataAtual.getTime() - this.dataNascimento.getTime();
        long anos = diferencaMillis / (1000L * 60 * 60 * 24 * 365);
        return (int) anos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a data de nascimento (dd/MM/yyyy): ");
        String dataNascimentoInput = scanner.nextLine();
        
        System.out.print("Digite o nome: ");
        String nomeInput = scanner.nextLine();
        
        System.out.print("Digite o sobrenome: ");
        String sobrenomeInput = scanner.nextLine();
       
        Cliente cliente = new Cliente(nomeInput, sobrenomeInput, dataNascimentoInput);

        System.out.println("Data de Nascimento: " + cliente.mostrarDataNascimento());
        System.out.println("Nome completo: " + cliente.mostrarNomeSobrenome());
        System.out.println("Idade: " + cliente.calcularIdade() + " anos");

        scanner.close();
    }
}