package modelo;

import java.util.Scanner;

public class idade3 {

	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		int idade;

		System.out.println("Digite o ano em que voce nasceu");
		idade = entrada.nextInt(); 
		
		
		if(idade <=2004) {
			System.out.println("Voce e maior de idade ");
		}else {
			System.out.println(" Voce e menor de idade");
			
		}
	}

}