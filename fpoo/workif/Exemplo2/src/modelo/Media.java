package modelo;

import java.util.Scanner;

public class Media {
    
	public static Scanner leia;
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n1, n2, result, media; 

		
		System.out.print("Digite a primeira nota");
		n1 = leia.nextInt();
				
		System.out.print("Digite a segunda nota");
		n2 = leia.nextInt();
		
		result =  n1 + n2;
		
		media = result / 2;
		
		System.out.println(" sua media final eh  [" + media + "] ");
		
		
		if(media > 5) {
			System.out.println("Parabens , voce passou de ano"
					+ "passou de ano");
		}else{
			System.out.println("Repetiu de Ano!");
		}
			
	
		}
}
  