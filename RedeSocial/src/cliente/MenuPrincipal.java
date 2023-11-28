package cliente;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Usuario gerenciador = new Usuario();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            exibirMenuPrincipal();
            opcao = lerOpcao(scanner);

            switch (opcao) {
                case 1:
                    // NovoUsuario
                    try {
                        System.out.println("Opção selecionada: NovoUsuario");
                        System.out.println("Informe os dados do novo usuário:");
                        System.out.print("Nome de usuário: ");
                        String nomeUsuario = scanner.next();
                        System.out.print("Senha: ");
                        String senha = scanner.next();

                        Usuario novoUsuario = new Usuario(nomeUsuario, senha);
                        gerenciador.adicionarUsuario(novoUsuario);
                        System.out.println("Novo usuário adicionado com sucesso!");
                    } catch (Exception e) {
                        System.out.println("Erro ao adicionar novo usuário: " + e.getMessage());
                    }
                    break;

                case 2:
                    // RemoveUsuario
                    try {
                        System.out.println("Opção selecionada: RemoveUsuario");
                        // Implemente a lógica de remoção de usuário aqui
                        // Pode solicitar usuário, senha, confirmar a exclusão, etc.
                    } catch (Exception e) {
                        System.out.println("Erro ao remover usuário: " + e.getMessage());
                    }
                    break;

                case 3:
                    // Logar
                    try {
                        System.out.println("Opção selecionada: Logar");
                        System.out.print("Nome de usuário: ");
                        String nomeUsuarioLogin = scanner.next();
                        System.out.print("Senha: ");
                        String senhaLogin = scanner.next();

                        Sessao sessao = gerenciador.logar(nomeUsuarioLogin, senhaLogin);
                        if (sessao != null) {
                            // Redirecione para o menu de sessão, se desejado
                            // Implemente conforme a lógica do seu programa
                            System.out.println("Login bem-sucedido!");
                        } else {
                            System.out.println("Nome de usuário ou senha incorretos. Tente novamente.");
                        }
                    } catch (Exception e) {
                        System.out.println("Erro ao fazer login: " + e.getMessage());
                    }
                    finally {
					}
                    break;

                case 0:
                    // Sair
                    System.out.println("Saindo do programa. Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);
    }

    private static void exibirMenuPrincipal() {
        System.out.println("\n----- Menu Principal -----");
        System.out.println("1. NovoUsuario");
        System.out.println("2. Remove Usuario");
        System.out.println("3. Logar");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static int lerOpcao(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.next(); // Limpa o buffer do scanner
            return -1; // Retorna -1 para indicar uma entrada inválida
        }
    }
}
