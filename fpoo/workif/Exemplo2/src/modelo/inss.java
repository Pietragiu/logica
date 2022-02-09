package modelo;
 
import java.util.Scanner;

public class inss {

	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		int salario, desconto;
		System.out.println("Digite seu salario");
		salario = entrada.nextInt(); 
		
		if(salario >2000) {
		
		desconto = salario * 11/100;
		
		salario = salario - desconto;
		
		System.out.printf("o desconto dinal sera de: [" + desconto + "] porcento\n");
		System.out.printf("o salario final sera de: [" + salario + "] R$");
	}else if( salario <1200) {
		
		desconto = salario * 8/100;
		
		salario = salario - desconto;
		
		System.out.printf("o desconto dinal sera de: [" + desconto + "] porcento\n");
		System.out.printf("o salario final sera de: [" + salario + "] R$");
		
	}else {
		
        desconto = salario * 9/100;
        salario = salario - desconto;
		
		System.out.printf("o desconto dinal sera de: [" + desconto + "] porcento\n");
		System.out.printf("o salario final sera de: [" + salario + "] R$");  
		
	 }   
		
	  }
		
	
		
	}


