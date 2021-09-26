package reset.exercicios;

import java.util.Scanner;

public class Aula09Exercicio04 
{

	public static void main(String[] args) 
	{
		/*
		Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. 
		O usuário deve informar de qual número ele deseja ver a tabuada. 
		A saída deve ser conforme o exemplo abaixo:
		Tabuada do 5: 

		5 x 1 = 5 
		5 x 2 = 10
		.
		.
		.
		5 x 10 = 50
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número entre 1 e 10: ");
		int num = scan.nextInt();
		while (num < 1 || num > 10)
		{
		System.out.println("Valor inválido!!");	
		Scanner nscan = new Scanner(System.in);
		System.out.println("Digite um número entre 1 e 10: ");
		num = nscan.nextInt();
		}
		for(int i = 1; i <= 10 ; i++)
		{
		//int resultado = num*i;	
		System.out.println(num + " x " + i + " = " + num*i);	
		}

	}

}
