package reset.exercicios;

import java.util.Scanner;

public class Aula08Exercicio02 
{

	public static void main(String[] args) 
	{
		//Fa�a um Programa que leia um n�mero e exiba o dia correspondente da semana.
		//(1=Domingo, 2=Segunda, etc.), caso seja informado um valor que n�o corresponda � um dia da semana, 
		//ent�o deve imprimir a mensagem Valor inv�lido!.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um dia da semana (1 a 7)");
		
		int diaDaSemana = scan.nextInt();
		
		switch(diaDaSemana)
		{
		case 1: System.out.println("Domingo"); break;
		case 2: System.out.println("Segunda"); break;
		case 3: System.out.println("Ter�a"); break;
		case 4: System.out.println("Quarta"); break;
		case 5: System.out.println("Quinta"); break;
		case 6: System.out.println("Sexta"); break;
		case 7: System.out.println("S�bado"); break;
		default: System.out.println("Valor inv�lido!");
		}

	}

}
