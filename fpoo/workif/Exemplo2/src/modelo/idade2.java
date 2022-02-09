package modelo;

import java.util.Scanner;

public class idade2 {

	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		int anoNascimento, anoAtual = 2022, idade;
		
		System.out.println("Digite o ano que voce nasceu");
        anoNascimento = entrada.nextInt();
        
        idade = anoAtual - anoNascimento;
        
        if(idade >=18) {
        		
        System.out.println("Voce e maior de idade");
	}else {
		System.out.println(" Voce e menor de idade");
	}  
	
	}

}
