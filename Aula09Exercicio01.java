package reset.exercicios;

import java.util.Scanner;

public class Aula09Exercicio01 
{

	public static void main(String[] args) 
	{
	//Fa�a um programa que pe�a uma nota, entre zero e dez. 
	//Caso o valor informado seja inv�lido, ou seja, n�o esteja entre zero e dez, 
	//mostre uma mensagem informando o problema, 
	//mas mantenha o programa em execu��o pedindo novamente a nota 
	//at� que o usu�rio informe um valor v�lido. 
	//Quando o usu�rio informar uma nota v�lida, imprima o valor da nota.
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma nota entre 0 e 10: ");
		int nota = scan.nextInt();
		while (nota < 0 || nota > 10)
		{
		System.out.println("Valor inv�lido!!");	
		Scanner nscan = new Scanner(System.in);
		System.out.println("Digite uma nota entre 0 e 10: ");
		nota = nscan.nextInt();
		}
		System.out.println("Valor da nota: " + nota);
	}

}
