package aula02;

import java.util.Scanner;

public class Aula02 {

	public static void main(String[] args) {
		
	//EXERCICIO 01
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite o primeiro número: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = leia.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		num3 = leia.nextInt();
		
		
		if(num1 > num2 && num1 > num3  ) {
			System.out.println("O maior numero é: " + num1);
			
		}else if(num2 > num1 && num2 > num3) {
			System.out.println("O maior numero digita foi : " +num2);
		} else{
			System.out.println("O maior numero digita foi : " +num3);
			
		}
		
	}

}
