package reset.exercicios;

import java.util.Scanner;

public class Aula08Exercicio01 
{

	public static void main(String[] args) 
	{
		//Fa�a um programa que tenha como entradas 4 notas e calcule a m�dia. Ao final o programa deve apresentar:
			//A mensagem Aluno aprovado, se a m�dia alcan�ada for igual ou superior a sete;
			//A mensagem Aluno reprovado, se a m�dia for inferior a sete;
			//A mensagem Aluno aprovado com louvores, se a m�dia for igual a dez.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota:");
		double primeiraNota = scan.nextDouble();
		System.out.println("Entre com a segunda nota:");
		double segundaNota = scan.nextDouble();
		System.out.println("Entre com a terceira nota:");
		double terceiraNota = scan.nextDouble();
		System.out.println("Entre com a quarta nota:");
		double quartaNota = scan.nextDouble();
		double media = (primeiraNota + segundaNota + terceiraNota + quartaNota)/4;
		
		if (media < 7)
		{
			System.out.println("Aluno reprovado");
		}
		else if (media >= 7 && media < 10)
		{
			System.out.println("Aluno aprovado");
		}
		else if (media == 10)
		{
			System.out.println("Aluno aprovado com louvores");
		}
		
	}

}
