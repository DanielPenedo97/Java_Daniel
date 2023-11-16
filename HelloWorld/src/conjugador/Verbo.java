package conjugador;

import java.util.Scanner;

public class Verbo {
	private	String radical;
	private	String sufixo;
	
	public Verbo(String radical, String sufixo) {
		this.radical = radical;
		this.sufixo = sufixo;
	}

	public String getRadical() {
		return radical;
	}

	public void setRadical(String radical) {
		this.radical = radical;
	}

	public String getSufixo() {
		return sufixo;
	}

	public void setSufixo(String sufixo) {
		this.sufixo = sufixo;
	}

	public void conjugar() {
		System.out.println("Eu "+radical+"o");
		System.out.println("Tu "+radical+"as");
		System.out.println("Ele "+radical+"a");
		System.out.println("Nos "+radical+"amos");
		System.out.println("Vos "+radical+"ais");
		System.out.println("Eles "+radical+"am");
	}
	
	public static void main(String[] args) {
		String palavra;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o radical");
		palavra = sc.nextLine();
		
		String value = palavra;
		String lastTwo = null;
		
		if (value != null && value.length() >= 2) {  
		    lastTwo = value.substring(value.length() - 2);
		    palavra = palavra.substring(0, palavra.length() - 2);
		    //System.out.println("Sufixo: "+lastTwo);
		}
		//System.out.println("Digite o sufixo");
		//suf = sc.nextLine();
		Verbo verbo = new Verbo(palavra, lastTwo);
		verbo.conjugar();
		System.out.println("Verbo: "+verbo.getRadical()+verbo.getSufixo());
	}
}
