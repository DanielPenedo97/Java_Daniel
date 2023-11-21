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
    <h3>Exemplo 1 de Classe</h3>
    <hr>
<<<<<<< HEAD
    <select id="example1" onchange="showCode('example1')">
        <option value="java">Java</option>
        <option value="cpp">C++</option>
    </select>
    <div id="code-example1-java" class="code" style="display: none;">
        <pre>
            <code>
                class Carro {
                    private String cor;
                    private String modelo;
                    private int ano;
                    
                    void andar() {
                        System.out.println("O carro está andando");
                    }
                }
            </code>
        </pre>
    </div>
    <div id="code-example1-cpp" class="code" style="display: none;">
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
                }
            </code>
        </pre>
    </div>
    <hr>
    <h3>Exemplo 2 de Classe</h3>
    <hr>
    <select id="example2" onchange="showCode('example2')">
        <option value="java">Java</option>
        <option value="cpp">C++</option>
    </select>
    <div id="code-example2-java" class="code" style="display: none;">
        <pre>
            <code>
                class Pessoa {
                    private String nome;
                    private int idade;
                    private String endereco;
                    
                    void andar() {
                        System.out.println("A pessoa está andando");
                    }
                }
            </code>
        </pre>
    </div>
    <div id="code-example2-cpp" class="code" style="display: none;">
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
                }
            </code>
        </pre>
    </div>
=======
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
    </p>
    <hr>
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
        }
                </code>
            </pre>
        </div>
>>>>>>> 98df12fbb60894987c915d2998b22ee2bfcc37c6
    <hr>
    <h3>Exemplo 3 de Classe</h3>
    <hr>
<<<<<<< HEAD
    <select id="example3" onchange="showCode('example3')">
        <option value="java">Java</option>
        <option value="cpp">C++</option>
    </select>
    <div id="code-example3-java" class="code" style="display: none;">
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
    <div id="code-example3-cpp" class="code" style="display: none;">
        <pre>
            <code>
                class Conta {
                    private:
                        int numero;
                        String titular;
                        double saldo;
                        double limite;
=======
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
>>>>>>> 98df12fbb60894987c915d2998b22ee2bfcc37c6
                        
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
    <hr>
    <h3>Exemplo 4 de Classe</h3>
    <hr>
    <select id="example4" onchange="showCode('example4')">
        <option value="java">Java</option>
        <option value="cpp">C++</option>
    </select>
    <div id="code-example4-java" class="code" style="display: none;">
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
                }
            </code>
        </pre>
    </div>
    <div id="code-example4-cpp" class="code" style="display: none;">
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
                }
            </code>
        </pre>
    </div>
    <hr>
    <h3>Exemplo 5 de Classe</h3>
    <hr>
    <select id="example5" onchange="showCode('example5')">
        <option value="java">Java</option>
        <option value="cpp">C++</option>
    </select>
    <div id="code-example5-java" class="code" style="display: none;">
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
                }
            </code>
        </pre>
    </div>
    <div id="code-example5-cpp" class="code" style="display: none;">
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
                }
            </code>
        </pre>
    </div>
    <script>
        function showCode(example) {
            var language = document.getElementById(example).value;
            var javaCode = document.getElementById("code-" + example + "-java");
            var cppCode = document.getElementById("code-" + example + "-cpp");
            
            if (language === "java") {
                javaCode.style.display = "block";
                cppCode.style.display = "none";
            } else if (language === "cpp") {
                javaCode.style.display = "none";
                cppCode.style.display = "block";
            }
        }
    </script>
</body>
</html>
