package aulajava4;

import java.util.Scanner;

public class AulaJava04 {

	public static void main(String[] args) {
		
		        Scanner leia = new Scanner(System.in);
		        int numero;
		        boolean validador = false;
		        int[] vetorNum = new int[] {2,5,1,3,4,9,7,8,10};
		        System.out.println("Digite um número para pesquisar");
		        numero = leia.nextInt();

		        for (int i =0 ; i < vetorNum.length ; i ++)
		        {
		            if (vetorNum[i]== numero)
		            {
		                System.out.println("O número "+numero+" está localizado na posição: "+i);
		                validador = true;

		            }

		        }
		        if ( validador == false)
		            System.out.println("O número "+numero+" não foi encontrado!");
		    }
		}
	
