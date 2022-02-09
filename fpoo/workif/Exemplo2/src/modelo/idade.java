package modelo;

import java.util.Scanner;

public class idade {

	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		int idade;

		System.out.println("Digite a sua idade");
		idade = entrada.nextInt(); 
		
		
		if(idade >=18) {
			System.out.println("Voce e maior de idade");
		}else {
			System.out.println(" Voce e menor de idade");
			
		}
	}

}
