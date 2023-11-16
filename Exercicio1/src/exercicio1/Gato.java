package exercicio1;

import java.util.Scanner;

/*
class Cat                      // begin declaration of the class
{
  public:                      // begin public section
    Cat(int initialAge);       // constructor
    Cat(const Cat& copy_from); //copy constructor
    Cat& operator=(const Cat& copy_from); //copy assignment
    ~Cat();                    // destructor

    int GetAge() const;        // accessor function
    void SetAge(int age);      // accessor function
    void Meow();
 private:                      // begin private section
    int itsAge;                // member variable
    char * string;
    
    // Method to make the cat meow
    void meow() const {
        std::cout << name << " says: Meow!\n";
    }

    // Method to celebrate the cat's birthday
    void celebrateBirthday() {
        age++;
        std::cout << name << " is now " << age << " years old! Happy Birthday!\n";
    }
};
*/

class Gato{
	private int idadeGato;
	private String nomeGato;

	public Gato(String nomeGato, int idadeGato) {
		this.nomeGato = nomeGato;
		this.idadeGato = idadeGato;
	}

	public int getIdadeGato() {
		return idadeGato;
	}
	
	public void setIdadeGato(int idadeGato) {
		this.idadeGato = idadeGato;
	}

	public String getNomeGato() {
		return nomeGato;
	}

	public void setNomeGato(String nomeGato) {
		this.nomeGato = nomeGato;
	}
	
	public void Miar() {
		System.out.println("Olhe, "+nomeGato +" esta miando");
	}
	
	public void aniversarioGato() {
		idadeGato ++;
		System.out.println("Parabens para "+nomeGato +", que esta fazendo " +idadeGato +" anos");
	}
	
	public static void main(String[] args) {
		String nome;
		int idade;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do seu Gato:");
		nome = sc.nextLine();

		Scanner myInput = new Scanner(System.in);
		System.out.println("Digite a idade do seu Gato:");
		idade = myInput.nextInt();
		
		Gato gato = new Gato(nome, idade);
		gato.Miar();
		gato.aniversarioGato();
	}
}