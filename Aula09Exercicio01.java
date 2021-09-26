package reset.exercicios;

import java.util.Scanner;

public class Aula09Exercicio01 
{

	public static void main(String[] args) 
	{
	//Faça um programa que peça uma nota, entre zero e dez. 
	//Caso o valor informado seja inválido, ou seja, não esteja entre zero e dez, 
	//mostre uma mensagem informando o problema, 
	//mas mantenha o programa em execução pedindo novamente a nota 
	//até que o usuário informe um valor válido. 
	//Quando o usuário informar uma nota válida, imprima o valor da nota.
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma nota entre 0 e 10: ");
		int nota = scan.nextInt();
		while (nota < 0 || nota > 10)
		{
		System.out.println("Valor inválido!!");	
		Scanner nscan = new Scanner(System.in);
		System.out.println("Digite uma nota entre 0 e 10: ");
		nota = nscan.nextInt();
		}
		System.out.println("Valor da nota: " + nota);
	}

}
