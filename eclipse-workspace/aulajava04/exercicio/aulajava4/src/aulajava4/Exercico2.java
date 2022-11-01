package aulajava4;

import java.util.Scanner;

public class Exercico2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
        int numero,soma = 0;
        String impar ="",par = "";
        int[] vetorNum = new int[10];

        for (int i = 0 ; i< 10 ; i++)
        {
            System.out.println("Digite o " + (i+1) + "º numero: ");
            numero = leia.nextInt();
            vetorNum[i] = numero;
        }
        for (int i = 0;i < vetorNum.length;i++)
        {
            if (i%2 != 0)
            {
                impar += ","+vetorNum[i];
            }
            if (vetorNum[i]%2==0)
            {
                par += ","+vetorNum[i];
            }
            soma += vetorNum[i];

        }
        System.out.println("Elementos nos índices ímpares:"+impar);
        System.out.println("Elementos nos índices pares:"+par);
        System.out.println("Soma : "+soma);
        System.out.println("Média : "+soma/10);

    }
}
