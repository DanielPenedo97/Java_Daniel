<!DOCTYPE html>
<html>
<head>
</head>
<body>
    <h1>Conceitos de Java</h1>
    <hr><br>
    <h2>1. O que é uma classe em Java e qual é a diferença entre uma classe e um
    objeto?</h2>
    <hr>
    <p>
        <h3>O que é uma Classe em Java?</h3>
        <hr>
        Uma classe é um grupo de objetos que possuem propriedades comuns. É um modelo ou blueprint a partir do qual os objetos são criados. É uma entidade lógica. Não pode ser físico.
        Uma classe Java pode conter:
        <ul>
        <strong>
            <li>Variáveis</li>
            <li>Métodos</li>
            <li>Construtores</li>
            <li>Blocos</li>
            <li>Classe e interface</li>
        </strong>
        </ul>
        <img src="class-in-java.png" alt="Classe e Objeto" width="250">
    </p>
    <p>
            <strong>Exemplo sintaxe para declarar uma classe:</strong>
            <div class="code">
                <pre>
                    <code>
                        class Carro {
                            private String cor;
                            private String modelo;
                            private int ano;
                            void andar() {
                                system.out.println("O carro está andando");
                            }
                        };
                    </code>
                </pre>
            </div>
        </p>
        <hr>
        <h3>O que é um objeto em Java?</h3>
        <hr>
        <p>Uma entidade que possui estado e comportamento é conhecida como um objeto, por exemplo, cadeira, bicicleta, marcador, caneta, mesa, carro, etc. Pode ser física ou lógica (tangível e intangível). O exemplo de um objeto intangível é o sistema bancário.
        Um objeto tem três características:
            <ul>
                <li><strong>Estado:</strong> representa os dados (valor) de um objeto.</li>
                <li><strong>Comportamento:</strong> representa o comportamento (funcionalidade) de um objeto, como depositar, sacar, etc.</li>
                <li><strong>Identidade:</strong> um objeto de identidade é tipicamente implementado através de um identificador único. O valor do ID não é visível para o usuário final, mas é usado internamente pelo JVM para identificar cada objeto exclusivamente.</li>
            </ul>
            Por exemplo, caneta é um objeto. O nome é Reynolds; a cor é branca, são conhecidos como estado. É usado para escrever, então escrever é o seu comportamento.
            <br>
            <strong>Um objeto é uma instância de uma classe.</strong> Uma classe é um modelo ou blueprint a partir do qual os objetos são criados. Portanto, um objeto é a instância (resultado) de uma classe.
        </p>
        <hr>
        <h3>Exemplo 1 de Classe em Java</h3>
        <hr>
        <p>
            <div class="code">
                <pre>
                    <code>
                        class Carro {
                            private String cor;
                            private String modelo;
                            private int ano;
                            void andar() {
                                system.out.println("O carro está andando");
                            }
                        };
                    </code>
                </pre>
            </div>
        </p><hr>
        <h3>Exemplo 1 da mesma Classe em C++</h3>
        <hr>
        <p>
            <div class="code">
                <pre>
                    <code>
                        class Carro {
                            private: 
                                String cor;
                                String modelo;
                                int ano;
                                void andar() {
                                    cout << "O carro está andando" << endl;
                                }
                        };
                    </code>
                </pre>
            </div>
        </p>
        <hr>
        <h3>Exemplo 2 de Classe em Java</h3>
        <hr>
            <div class="code">
                <pre>
                    <code>
                        class Pessoa {
                            private String nome;
                            private int idade;
                            private String endereco;
                            
                            void andar() {
                                System.out.println("A pessoa está andando");
                            }
                            
                            void falar(String mensagem) {
                                System.out.println("A pessoa está falando: " + mensagem);
                            }
                        }
                    </code>
                </pre>
            </div>
        <hr>
        <h3>Exemplo 2 da mesma Classe em C++</h3>
        <hr>
        <p>
            <div class="code">
                <pre>
                    <code>
                        class Pessoa {
                            private:
                                String nome;
                                int idade;
                                String endereco;
                                
                                void andar() {
                                    cout << "A pessoa está andando" << endl;
                                }
                                
                                void falar(String mensagem) {
                                    cout << "A pessoa está falando: " << mensagem << endl;
                                }
                        }
                    </code>
                </pre>
            </div>
        </p>
        <hr>
        <h3>Exemplo 3 de Classe em Java</h3>
        <hr>
        <p>
            <div class="code">
                <pre>
                    <code>
                        class Conta {
                            private int numero;
                            private String titular;
                            private double saldo;
                            private double limite;
                            
                            void sacar(double valor) {
                                this.saldo -= valor;
                            }
                            
                            void depositar(double valor) {
                                this.saldo += valor;
                            }
                            
                            void transferir(double valor, Conta destino) {
                                this.saldo -= valor;
                                destino.saldo += valor;
                            }
                        }
                    </code>
                </pre>
            </div>
        </p>
        <hr>
        <h3>Exemplo 3 da mesma Classe em C++</h3>
        <hr>
        <p>
            <div class="code">
                <pre>
                    <code>
                        class Conta {
                            private:
                                int numero;
                                String titular;
                                double saldo;
                                double limite;
                                
                                void sacar(double valor) {
                                    this.saldo -= valor;
                                }
                                
                                void depositar(double valor) {
                                    this.saldo += valor;
                                }
                                
                                void transferir(double valor, Conta destino) {
                                    this.saldo -= valor;
                                    destino.saldo += valor;
                                }
                        }
                    </code>
                </pre>
            </div>
        </p>
        <hr>
        <h3>Exemplo 4 de Classe em Java</h3>
        <hr>
        <p>
            <div class="code">
                <pre>
                    <code>
                        class Aluno {
                            private String nome;
                            private String matricula;
                            private String curso;
                            private String[] disciplinas;
                            
                            void estudar() {
                                System.out.println("O aluno está estudando");
                            }
                            
                            void fazerProva() {
                                System.out.println("O aluno está fazendo prova");
                            }
                            
                            void fazerTrabalho() {
                                System.out.println("O aluno está fazendo trabalho");
                            }
                        }
                    </code>
                </pre>
            </div>
        </p>
        <hr>
        <h3>Exemplo 4 da mesma Classe em C++</h3>
        <hr>
        <p>
            <div class="code">
                <pre>
                    <code>
                        class Aluno {
                            private:
                                String nome;
                                String matricula;
                                String curso;
                                String[] disciplinas;
                                
                                void estudar() {
                                    cout << "O aluno está estudando" << endl;
                                }
                                
                                void fazerProva() {
                                    cout << "O aluno está fazendo prova" << endl;
                                }
                                
                                void fazerTrabalho() {
                                    cout << "O aluno está fazendo trabalho" << endl;
                                }
                        }
                    </code>
                </pre>
            </div>
        </p>
        <hr>
        <h3>Exemplo 5 de Classe em Java</h3>
        <hr>
        <p>
            <div class="code">
                <pre>
                    <code>
                        class Professor {
                            private String nome;
                            private String matricula;
                            private String curso;
                            private String[] disciplinas;
                            
                            void darAula() {
                                System.out.println("O professor está dando aula");
                            }
                            
                            void corrigirProva() {
                                System.out.println("O professor está corrigindo prova");
                            }
                            
                            void corrigirTrabalho() {
                                System.out.println("O professor está corrigindo trabalho");
                            }
                        }
                    </code>
                </pre>
            </div>
        </p>
        <hr>
        <h3>Exemplo 5 da mesma Classe em C++</h3>
        <hr>
        <p>
            <div class="code">
                <pre>
                    <code>
                        class Professor {
                            private:
                                String nome;
                                String matricula;
                                String curso;
                                String[] disciplinas;
                                
                                void darAula() {
                                    cout << "O professor está dando aula" << endl;
                                }
                                
                                void corrigirProva() {
                                    cout << "O professor está corrigindo prova" << endl;
                                }
                                
                                void corrigirTrabalho() {
                                    cout << "O professor está corrigindo trabalho" << endl;
                                }
                        }
                    </code>
                </pre>
            </div>
        </p>






</body>
</html>
