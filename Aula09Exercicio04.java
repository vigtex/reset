package reset.exercicios;

import java.util.Scanner;

public class Aula09Exercicio04 
{

	public static void main(String[] args) 
	{
		/*
		Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer n�mero inteiro entre 1 a 10. 
		O usu�rio deve informar de qual n�mero ele deseja ver a tabuada. 
		A sa�da deve ser conforme o exemplo abaixo:
		Tabuada do 5: 

		5 x 1 = 5 
		5 x 2 = 10
		.
		.
		.
		5 x 10 = 50
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um n�mero entre 1 e 10: ");
		int num = scan.nextInt();
		while (num < 1 || num > 10)
		{
		System.out.println("Valor inv�lido!!");	
		Scanner nscan = new Scanner(System.in);
		System.out.println("Digite um n�mero entre 1 e 10: ");
		num = nscan.nextInt();
		}
		for(int i = 1; i <= 10 ; i++)
		{
		//int resultado = num*i;	
		System.out.println(num + " x " + i + " = " + num*i);	
		}

	}

}
